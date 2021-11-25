package is.hi.energy.Controllers;

import is.hi.energy.Persistence.Entities.User;
import is.hi.energy.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    // Takes the user to the signup page and adds the signup form.
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signupGET(User user){
        return "signup";
    }

    // Takes the data from the users signup form and compares with the database.
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPOST(User user, BindingResult result, Model model){
        // If any given data was incorrect, return the user to the signup page.
        if (result.hasErrors()){
            return "redirect:/signup";
        }
        User exists = userService.findByUsername(user.getUsername());
        // Otherwise, if the user does not exist, create a new user.
        if(exists == null){
            userService.save(user);
        }
        return "redirect:/";
    }

    // Takes the user to the login page and adds the login form.
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(User user){
        return "login";
    }

    // Takes the data from the users' login form and compares with the database.
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPOST(User user, BindingResult result, Model model, HttpSession session){
        // If any given data was incorrect, return the user to the login page to try again.
        if(result.hasErrors()){
            return "login";
        }
        User exists = userService.login(user);
        // Otherwise, if the user exists, proceed with the login and return to the front page.
        if(exists != null){
            session.setAttribute("LoggedInUser", exists);
            model.addAttribute("LoggedInUser", exists);
            return "/";
        }
        return "redirect:/";
    }

    // Retrieve which user is currently logged in (mainly used for testing session functionality).
    @RequestMapping(value = "/loggedin", method = RequestMethod.GET)
    public String loggedinGET(HttpSession session, Model model){
        User sessionUser = (User) session.getAttribute("LoggedInUser");
        if(sessionUser != null){
            model.addAttribute("LoggedInUser", sessionUser);
            return "loggedInUser";
        }
        return "redirect:/";
    }
}

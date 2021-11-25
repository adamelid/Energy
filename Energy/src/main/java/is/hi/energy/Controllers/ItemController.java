package is.hi.energy.Controllers;

import is.hi.energy.Persistence.Entities.Item;
import is.hi.energy.Services.CartService;
import is.hi.energy.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {
    private ItemService itemService;
    private CartService cartService;

    @Autowired
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @RequestMapping("/")
    public String itemPage(Model model){
        //Call a method in a Service Class
        List<Item> allItems = itemService.findAll();
        //Add some data to the Model
        model.addAttribute("items", itemService.findAll());
        return "home";
    }

    // Adds the form for adding items to /additem.
    @RequestMapping(value = "/additem", method = RequestMethod.GET)
    public String addItemForm(Item item){
        return "newItem";
    }

    // Gathers the information from the /additem form and creates a new item.
    @RequestMapping(value = "/additem", method = RequestMethod.POST)
    public String addItem(Item item, BindingResult result, Model model){
        // If the information given was faulty, return to newItem page to try again.
        if(result.hasErrors()){
            return "newItem";
        }
        // Otherwise, save the new item and return to the front page.
        itemService.save(item);
        return "redirect:/";
    }

    // Deletes the corresponding item from the item database and returns the user.
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteItem(@PathVariable("id") long id, Model model){
        Item itemToDelete = itemService.findByID(id);
        itemService.delete(itemToDelete);
        return "redirect:/";
    }

    // Adds the corresponding item to the users cart and returns the user.
    @RequestMapping(value = "/addtocart/{id}", method = RequestMethod.GET)
    public String addToCart(@PathVariable("id") long id, Model model){
        Item itemToAdd = itemService.findByID(id);
        cartService.addToCart(itemToAdd);
        return "redirect:/";
    }

    // Removes the corresponding item from the users cart and returns the user.
    @RequestMapping(value = "/removefromcart/{id}", method = RequestMethod.GET)
    public String removeFromCart(@PathVariable("id") long id, Model model){
        Item itemToRemove = itemService.findByID(id);
        cartService.removeFromCart(itemToRemove);
        return "redirect:/cart";
    }
}

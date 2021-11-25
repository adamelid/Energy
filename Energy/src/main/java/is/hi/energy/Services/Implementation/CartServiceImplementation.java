package is.hi.energy.Services.Implementation;

import is.hi.energy.Persistence.Entities.Cart;
import is.hi.energy.Persistence.Entities.Item;
import is.hi.energy.Persistence.Repositories.CartRepository;
import is.hi.energy.Persistence.Repositories.ItemRepository;
import is.hi.energy.Services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Implementation class for Cart service (adding/removing from cart).
@Service
public class CartServiceImplementation implements CartService {
    private CartRepository cartRepository;

    @Autowired
    public CartServiceImplementation(CartRepository cartRepository) { this.cartRepository = cartRepository; }

    @Override
    public Cart addToCart(Item item) {

        return cartRepository.addToCart(item);
    }

    @Override
    public void removeFromCart(Item item) {

        cartRepository.removeFromCart(item);
    }
}
package is.hi.energy.Services;

import is.hi.energy.Persistence.Entities.Cart;
import is.hi.energy.Persistence.Entities.Item;

// Service class for cart related methods.
public interface CartService {

    Cart addToCart(Item item);
    void removeFromCart(Item item);
}
package is.hi.energy.Services;

import is.hi.energy.Persistence.Entities.Cart;
import is.hi.energy.Persistence.Entities.Item;

public interface CartService {

    Cart addToCart(Item item);
    void removeFromCart(Item item);
}

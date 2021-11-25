package is.hi.energy.Persistence.Repositories;

import is.hi.energy.Persistence.Entities.Cart;
import is.hi.energy.Persistence.Entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

    // Methods for adding and removing from a users cart.
    Cart addToCart(Item item);
    void removeFromCart(Item item);
}
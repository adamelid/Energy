package is.hi.energy.Persistence.Repositories;

import is.hi.energy.Persistence.Entities.Cart;
import is.hi.energy.Persistence.Entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository  extends JpaRepository<Item, Long> {

    Item save(Item item);
    void delete(Item item);
    List<Item> findAll();
    List<Item> findByName(String name);
    List<Item> findByManufacturer(String manufacturer);
    Item findByID(long id);
}

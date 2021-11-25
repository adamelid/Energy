package is.hi.energy.Services;

import is.hi.energy.Persistence.Entities.Item;

import java.util.List;

// Service class for Item related methods.
public interface ItemService {
    Item findByName(String name);
    Item findByManufacturer(String manufacturer);
    List<Item>findAll();
    Item findByID(long ID);
    Item save(Item item);
    void delete(Item item);
}

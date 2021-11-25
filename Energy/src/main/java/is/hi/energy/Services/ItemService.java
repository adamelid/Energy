package is.hi.energy.Services;

import is.hi.energy.Persistence.Entities.Item;

import java.util.List;

public interface ItemService {
    Item findByName(String name);
    Item findByManufacturer(String manufacturer);
    List<Item>findAll();
    Item findByID(long ID);
    Item save(Item item);
    void delete(Item item);
}

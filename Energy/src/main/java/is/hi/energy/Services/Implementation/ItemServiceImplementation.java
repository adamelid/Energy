package is.hi.energy.Services.Implementation;

import is.hi.energy.Persistence.Entities.Item;
import is.hi.energy.Persistence.Repositories.ItemRepository;
import is.hi.energy.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Implementation class for Item service.
@Service
public class ItemServiceImplementation implements ItemService {
    private ItemRepository itemRepository;

    @Autowired
    public ItemServiceImplementation(ItemRepository itemRepository) { this.itemRepository = itemRepository; }

    @Override
    public Item findByName(String name) {
        return itemRepository.findByName(name).get(0);
    }

    @Override
    public Item findByManufacturer(String manufacturer) {
        return itemRepository.findByManufacturer(manufacturer).get(0);
    }

    @Override
    public List<Item> findAll() {

        return itemRepository.findAll();
    }

    @Override
    public Item findByID(long ID) {
        return itemRepository.findByID(ID);
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete(Item item) {

        itemRepository.delete(item);
    }
}

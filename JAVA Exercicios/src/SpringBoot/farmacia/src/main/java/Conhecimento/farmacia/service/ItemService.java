package Conhecimento.farmacia.service;

import Conhecimento.farmacia.entity.Item;
import Conhecimento.farmacia.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
    public Optional<Item> getItemById(Long id){
        return ItemRepository.findById(id);
    }
    public Item createItem(Item item){
        return itemRepository.save(item);
    }
    public Item updateItem (long id, Item itemDetails){
        Item item = ItemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        item.setName(itemDetails.getName());
        item.setDescription(itemDetails.getDescription());
        item.setQuantity(itemDetails.getQuantity());
        item.setPrice(itemDetails.getPrice());
        return itemRepository.save(item);
    }
}

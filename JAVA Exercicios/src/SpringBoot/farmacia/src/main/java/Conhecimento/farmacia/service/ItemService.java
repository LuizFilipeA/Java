package Conhecimento.farmacia.service;

import Conhecimento.farmacia.entity.Item;
import Conhecimento.farmacia.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    // Autowired é deixar o spring boot admininstrar o construtor do objeto, não precisa usar "new objeto... "
    // Importando a interface de repositório da JPA, que está contida em na nossa interface ItemRepository do package repository
    @Autowired
    private ItemRepository itemRepository;

    //Importando lista do java util
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id){
        return itemRepository.findById(id);
    }

    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public Item updateItem (long id, Item itemDetails){
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        item.setName(itemDetails.getName());
        item.setDescription(itemDetails.getDescription());
        item.setQuantity(itemDetails.getQuantity());
        item.setPrice(itemDetails.getPrice());
        return itemRepository.save(item);
    }

    public void deleteItem (Long id){
        Item item = itemRepository.findById(id).orElseThrow(()-> new RuntimeException("Item not found"));
        itemRepository.delete(item);
    }
}

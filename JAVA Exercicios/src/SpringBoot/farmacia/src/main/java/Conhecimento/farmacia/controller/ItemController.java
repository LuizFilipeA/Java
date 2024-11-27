package Conhecimento.farmacia.controller;

import Conhecimento.farmacia.entity.Item;
import Conhecimento.farmacia.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//· GET. · PUT. · POST. · DELETE. · PATCH. · HEAD. · OPTIONS. · TRACE. São os métodos do protocolo http.

//Indicando ao spring boot que é uma classe de controller de aplicação rest e que irá controlar as rotas da aplicação
@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List <Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable Long id){
        return itemService.getItemById(id);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @PutMapping ("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item itemDetails){
        return itemService.updateItem(id, itemDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
    }




}

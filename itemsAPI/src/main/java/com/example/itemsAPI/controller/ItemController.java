package com.example.itemsAPI.controller;

import com.example.itemsAPI.repository.entity.Item;
import com.example.itemsAPI.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController{

    final ItemRepository itemRepository;

    public ItemController(@Autowired ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public Iterable<Item> getItems(){
        return itemRepository.findAll();
    }

//    @PostMapping("/")
//    public void addItem(@RequestBody ItemRequest itemRequest){
//        itemService.addItem(itemRequest);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteItemById(@PathVariable(value = "id") Integer id){
//        itemService.deleteById(id);
//    }
//
//    @PutMapping("/")
//    public void updateItem(@RequestBody Item item){
//        itemService.updateItem(item);
//    }

}


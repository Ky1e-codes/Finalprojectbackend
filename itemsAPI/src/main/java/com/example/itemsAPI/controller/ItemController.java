package com.example.itemsAPI.controller;

//import com.example.itemsAPI.controller.dto.ItemDto;
import com.example.itemsAPI.repository.ItemRepository;
import com.example.itemsAPI.repository.entity.Item;
import com.example.itemsAPI.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;
    private final ItemService itemService;

    public ItemController(ItemService itemService) {

        this.itemService = itemService;
    }

    @GetMapping
    public String celebration() {
        return "Welcome to Items!";
    }

    @GetMapping("/all")
    public List<Item> getItems() {

        return itemService.getItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById
            (@PathVariable(value = "id") Integer id)
            throws ResourceNotFoundException {
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found for this id :: " + id));
        return ResponseEntity.ok().body(item);
    }

    @CrossOrigin
    @PostMapping
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
//        return bookRepository.save(book);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Item> update
            (@RequestBody Item item,
             @PathVariable Integer id) {
        Item update = itemRepository.findById(id)
                .orElseThrow();

        update.setName(item.getName());
        update.setDescription(item.getDescription());
        update.setImageUrl(item.getImageUrl());

        itemRepository.save(update);

        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteItem(@PathVariable(value = "id") Integer id)
            throws ResourceNotFoundException {
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found for this id :: " + id));

        itemRepository.delete(item);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
//import com.example.itemsAPI.controller.dto.ItemDto;
//import com.example.itemsAPI.repository.entity.Item;
//import com.example.itemsAPI.service.ItemService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
////@ItemServiceMySql
//@RequestMapping("/item")
//public class ItemController{
//
////    final ItemService itemService;
//    private ItemService itemService;
//    private Item update;
//    private ResponseEntity<Integer> response;
//    private List<Item> item;
//
//    @PostMapping
//    public ResponseEntity<Item> createItem(@RequestBody Item item) {
//    Item savedItem = itemService.addItem(item);
//    return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
//}
//        @GetMapping("/all")
//    public Iterable<Item> getItems(){
//
//        return itemService.all();
//    }
//@GetMapping("{id}")
//    public ResponseEntity<Item> getItemById(@PathVariable("id")
//                                            Integer itemId) {
//    Item item = itemService.getItemById(itemId);
//    return new ResponseEntity<>(item, HttpStatus.OK);
//}
////@GetMapping("/all")
////    public ResponseEntity<List<Item>> getAllItems() {
////    return new ResponseEntity<> (item, HttpStatus.OK);
////}
//@PutMapping("{id}")
//    public ResponseEntity<Item> update(@PathVariable("id") Integer id,
//                                       @RequestBody Item item) {
//    return new ResponseEntity<>(update, HttpStatus.OK);
//}
//    @DeleteMapping("{id}")
//    public ResponseEntity<Integer> delete(@PathVariable("id") Integer id){
//        itemService.delete(id);
//        return response;
//    }
//    public ItemController(@Autowired ItemService itemService)
//    {
//
//        this.itemService = itemService;
//    }

//    @GetMapping("/all")
//    public Iterable<Item> getItems(){
//
//        return itemService.all();
//    }
//
//    @PostMapping
//    public Item save( @RequestBody ItemDto itemDto )
//    {
//        return itemService.save( new Item( itemDto ) );
//    }
//
//    @GetMapping("/{id}")
//    public Item findById( @PathVariable Integer id ){
//        return itemService.findById( id );
//    }
//
//    @PutMapping( "/{id}" )
//    public Item update( @RequestBody ItemDto itemDto,
//    @PathVariable Integer id )
//    {
//        Item item = itemService.findById( id );
//        item.setName( itemDto.getName() );
//        item.setDescription( itemDto.getDescription() );
//        item.setImageUrl( itemDto.getImageUrl() );
//        return itemService.save( item );
//    }
//
//    @DeleteMapping( "/{id}" )
//    public void delete( @PathVariable Integer id )
//    {
//        itemService.delete( id );
//    }


//}


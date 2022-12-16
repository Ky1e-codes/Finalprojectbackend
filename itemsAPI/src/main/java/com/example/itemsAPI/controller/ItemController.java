package com.example.itemsAPI.controller;

//import com.example.itemsAPI.controller.dto.ItemDto;
import com.example.itemsAPI.dto.ItemDto;
import com.example.itemsAPI.repository.ItemRepository;
import com.example.itemsAPI.repository.entity.Item;
import com.example.itemsAPI.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/item")
public class ItemController {

    private ItemService itemService;

    // build create Item REST API
    @PostMapping
    public ResponseEntity<ItemDto> createItem(@RequestBody ItemDto item){
        ItemDto savedItem = itemService.createItem(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    // build get Item by id REST API

    @GetMapping("{id}")
    public ResponseEntity<ItemDto> getItemById(@PathVariable("id") Integer id){
        ItemDto item = itemService.getItemById(id);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    // Build Get All Items REST API


    @CrossOrigin
    @PostMapping
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
//        return bookRepository.save(book);

    @GetMapping("/all")
    public ResponseEntity<List<ItemDto>> getAllItems(){
        List<ItemDto> items = itemService.getAllItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    // Build Update Item REST API
    @PutMapping("{id}")

    public ResponseEntity<ItemDto> updateItem(@PathVariable("id") Integer id,
                                              @RequestBody ItemDto item){
        item.setId(id);
        ItemDto updatedItem = itemService.updateItem(item);
        return new ResponseEntity<>(updatedItem, HttpStatus.OK);
    }

    // Build Delete Item REST API
    @DeleteMapping("{id}")
    public ResponseEntity<Integer> deleteItem(@PathVariable("id") Integer id){
        return itemService.deleteItem(id);
//        return new ResponseEntity <>("Item successfully deleted!", HttpStatus.OK);
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


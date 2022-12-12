package com.example.itemsAPI.controller;

import com.example.itemsAPI.controller.dto.ItemDto;
import com.example.itemsAPI.repository.entity.Item;
import com.example.itemsAPI.repository.ItemRepository;
import com.example.itemsAPI.service.ItemService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController{

    final ItemService1 itemService1;

    public ItemController(@Autowired ItemService1 itemService1 )
    {

        this.itemService1 = itemService1;
    }

    @GetMapping("/all")
    public Iterable<Item> getItems(){

        return itemService1.all();
    }

    @PostMapping
    public Item save( @RequestBody ItemDto itemDto )
    {
        return itemService1.save( new Item( itemDto ) );
    }

    @GetMapping("/{id}")
    public Item findItemById( @PathVariable Integer id ){
        return itemService1.findById( id );
    }

    @PutMapping( "/{id}" )
    public Item update( @RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Item item = itemService1.findById( id );
        item.setName( itemDto.getName() );
        item.setDescription( itemDto.getDescription() );
        item.setImageUrl( itemDto.getImageUrl() );
        return itemService1.save( item );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService1.delete( id );
    }


}


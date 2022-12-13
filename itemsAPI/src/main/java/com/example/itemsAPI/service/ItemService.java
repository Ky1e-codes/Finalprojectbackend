//package com.example.itemsAPI.service;
//
//import com.example.itemsAPI.repository.ItemRepository;
//import com.example.itemsAPI.repository.entity.Item;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ItemService
//{
//    private final ItemRepository itemRepository;
//
//    public ItemServiceMySQL(
//            @Autowired
//            ItemRepository itemRepository )
//    {
//        this.itemRepository = itemRepository;
//    }
//
//
//    public Item save(Item item )
//    {
//        itemRepository.save(item);
//        return null;
//    }
//
//
//    public void deleteItem( int itemId )
//    {
//        ItemRepository.deleteById(itemId);
//    }
//
//
//    public List<Item> all()
//    {
//        return itemRepository.findAll();
////        return null;
//    }
//
//
//    public Item findById( int itemId )
//    {
//        //TODO implement this method
//        return null;
//    }
//}
//


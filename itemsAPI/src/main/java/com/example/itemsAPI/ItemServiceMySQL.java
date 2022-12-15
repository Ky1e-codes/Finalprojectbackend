//package com.example.itemsAPI;
//
//import com.example.itemsAPI.repository.ItemRepository;
//import com.example.itemsAPI.repository.entity.Item;
//import com.example.itemsAPI.service.ItemService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ItemServiceMySQL extends ItemService {
//    private final ItemRepository itemRepository;
//    private Optional<Item> item;
//
//    public ItemServiceMySQL(@Autowired ItemRepository itemRepository) {
//        super();
//        this.itemRepository = itemRepository;
//    }
//
//    @Override
//    public Item save(Item item) {
//        return itemRepository.save(item);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        itemRepository.deleteById(id);
//    }
//
//    @Override
//    public List<Item> all() {
//        List<Item> result = new ArrayList<>();
//        itemRepository.findAll().forEach(result::add);
//        return result;
//    }
//
//    @Override
//    public Item findById(int id) {
//
//        return (Item) itemRepository.findById( id );
//    }
//}

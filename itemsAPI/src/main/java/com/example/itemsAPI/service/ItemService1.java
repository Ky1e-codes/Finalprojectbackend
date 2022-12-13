package com.example.itemsAPI.service;

import com.example.itemsAPI.repository.entity.Item;
import org.springframework.stereotype.Service;
//import com.example.itemsAPI.ItemServiceMySQL;

import java.util.List;
@Service
public interface ItemService1
{

    Item save(Item item );

    void delete( int id );

    List<Item> all();

    Item findById(int id );

}

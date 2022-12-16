package com.example.itemsAPI.service;


import com.example.itemsAPI.dto.ItemDto;
import com.example.itemsAPI.repository.entity.Item;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ItemService {
    ItemDto createItem(ItemDto item);

    ItemDto getItemById(Integer id);

//    Item getItemById(Integer id);

    List<ItemDto> getAllItems();

    ItemDto updateItem(ItemDto item);

    ResponseEntity<Integer> deleteItem(Integer id);
}



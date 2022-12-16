package com.example.itemsAPI.service;


import java.util.List;

import com.example.itemsAPI.ItemMapper;
import com.example.itemsAPI.dto.ItemDto;
import com.example.itemsAPI.repository.ItemRepository;
import com.example.itemsAPI.repository.entity.Item;
import com.example.itemsAPI.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    @Override
    public ItemDto createItem(ItemDto itemDto) {
        Item item = ItemMapper.mapToItem(itemDto);
        Item savedItem = itemRepository.save(item);
        ItemDto savedItemDto = ItemMapper.mapToItemDto(savedItem);
        return savedItemDto;
//        return itemRepository.save(item);
    }

    @Override
    public ItemDto getItemById(Integer id) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        Item item = optionalItem.get();
        return ItemMapper.mapToItemDto(item);
//        return optionalItem.get();
    }

    @Override
    public List<ItemDto> getAllItems() {
        List<Item> items = itemRepository.findAll();
        return items.stream().map(ItemMapper::mapToItemDto)
                .collect(Collectors.toList());
//        return itemRepository.findAll();
    }

    @Override
    public ItemDto updateItem(ItemDto item) {
        Item existingItem = itemRepository.findById(item.getId()).get();
        existingItem.setId(item.getId());
        existingItem.setName(item.getName());
        existingItem.setDescription(item.getDescription());
        existingItem.setImageUrl(item.getImageUrl());
        Item updatedItem = itemRepository.save(existingItem);
        return ItemMapper.mapToItemDto(updatedItem);
        //        return updatedItem;
    }

    @Override
    public ResponseEntity<Integer> deleteItem(Integer id) {
        itemRepository.deleteById(id);
        return null;
    }
}
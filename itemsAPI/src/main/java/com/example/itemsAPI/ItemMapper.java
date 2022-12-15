package com.example.itemsAPI;

import com.example.itemsAPI.dto.ItemDto;
import com.example.itemsAPI.repository.entity.Item;
public class ItemMapper {

    // Convert Item JPA Entity into ItemDto
    public static ItemDto mapToItemDto(Item item){
        ItemDto itemDto = new ItemDto(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.getImageUrl()
        );
        return itemDto;
    }

    // Convert ItemDto into Item JPA Entity
    public static Item mapToItem(ItemDto itemDto){
        Item item = new Item(
                itemDto.getId(),
                itemDto.getName(),
                itemDto.getDescription(),
                itemDto.getImageUrl()
        );
        return item;
    }
}
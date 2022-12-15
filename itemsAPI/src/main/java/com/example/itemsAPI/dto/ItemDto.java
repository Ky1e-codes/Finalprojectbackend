package com.example.itemsAPI.dto;//package com.example.itemsAPI.controller.dto;
//
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Integer id;
    private String name;
    private String description;
    private String imageUrl;
}

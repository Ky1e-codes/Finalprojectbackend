package com.example.itemsAPI.repository;

import com.example.itemsAPI.repository.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
//    static Optional<Item> findById(Integer id) {
//        return null;

package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer>{

}

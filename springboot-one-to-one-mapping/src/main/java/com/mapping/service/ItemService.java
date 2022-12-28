package com.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.model.Item;

import com.mapping.repository.ItemRepo;

@Service
public class ItemService {
	@Autowired
	ItemRepo itemrepo;
	
	public List<Item> findAllItems(){
		
		return itemrepo.findAll();
	}
	public Optional<Item> findByItemId(Integer itemId){
		
		return itemrepo.findById(itemId);
	}
	public Item saveItem(Item item) {
		return itemrepo.save(item);
	}
	

}

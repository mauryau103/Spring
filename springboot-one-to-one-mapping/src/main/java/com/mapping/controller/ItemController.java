package com.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.model.Item;
import com.mapping.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	
	@GetMapping("/getAllItem")
	public List<Item> findAllItems() {
        return itemService.findAllItems();
    }		
	@GetMapping("/getItemById/{id}")
    public Optional<Item> findItemById(@PathVariable(value = "id") Integer id) {
       return itemService.findByItemId(id);
    }
	@PostMapping("/saveItem")
	public Item saveItem(@RequestBody Item item) {
	    return itemService.saveItem(item);
	}


}

package com.thymmz.indiabazar.api;

import com.thymmz.indiabazar.model.Customer;
import com.thymmz.indiabazar.model.Item;
import com.thymmz.indiabazar.service.inter.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")
public class ItemController {
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") Integer id){
        return new ResponseEntity<Item>(itemService.getItemById(id), HttpStatus.OK);
    }
}

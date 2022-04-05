package com.thymmz.indiabazar.service.impl;

import com.thymmz.indiabazar.dao.ItemDao;
import com.thymmz.indiabazar.model.Customer;
import com.thymmz.indiabazar.model.Item;
import com.thymmz.indiabazar.service.inter.ItemService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemDao itemDao;

    public ItemServiceImpl(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Override
    public Item getItemById(Integer id) {
        Optional<Item> item = itemDao.findById(id);
        if(item.isPresent()){
            return item.get();
        }
        else {
            return null;
        }
    }
}

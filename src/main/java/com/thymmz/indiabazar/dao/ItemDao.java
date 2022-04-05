package com.thymmz.indiabazar.dao;

import com.thymmz.indiabazar.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item, Integer> {
}

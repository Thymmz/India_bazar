package com.thymmz.indiabazar.dao;

import com.thymmz.indiabazar.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ManufacturerDao extends JpaRepository<Manufacturer, Integer> {
}

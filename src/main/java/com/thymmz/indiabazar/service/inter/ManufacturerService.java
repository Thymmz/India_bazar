package com.thymmz.indiabazar.service.inter;

import com.thymmz.indiabazar.model.Manufacturer;

import java.util.List;

public interface ManufacturerService {
    List<Manufacturer> getAllManufacturers();
    Manufacturer getManufacturerById(Integer id);
}

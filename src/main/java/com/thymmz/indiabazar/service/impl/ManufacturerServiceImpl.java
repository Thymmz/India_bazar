package com.thymmz.indiabazar.service.impl;

import com.thymmz.indiabazar.dao.ManufacturerDao;
import com.thymmz.indiabazar.model.Manufacturer;
import com.thymmz.indiabazar.service.inter.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    private ManufacturerDao manufacturerDao;

    public ManufacturerServiceImpl(ManufacturerDao manufacturerDao) {
        this.manufacturerDao = manufacturerDao;
    }

    @Override
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerDao.findAll();
    }

    @Override
    public Manufacturer getManufacturerById(Integer id) {
        Optional<Manufacturer> manufacturer = manufacturerDao.findById(id);
        if(manufacturer.isPresent()){
            return manufacturer.get();
        }
        else{
            return null;
        }
    }
}

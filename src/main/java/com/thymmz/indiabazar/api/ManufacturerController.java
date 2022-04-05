package com.thymmz.indiabazar.api;

import com.thymmz.indiabazar.model.Manufacturer;
import com.thymmz.indiabazar.service.inter.ManufacturerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/manufacturer")
public class ManufacturerController {
    private ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping
    public List<Manufacturer> getAllManufacturers(){
        return manufacturerService.getAllManufacturers();
    }

    @GetMapping("{id}")
    public ResponseEntity<Manufacturer> getManufacturerById(@PathVariable("id") Integer id){
        return new ResponseEntity<Manufacturer>(manufacturerService.getManufacturerById(id), HttpStatus.OK);
    }
}

package com.thymmz.indiabazar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity(name = "Manufacturer")
public class Manufacturer {

    @Id
    private Integer id;
    private String name;
    private String web_addr;
    private String main_ph;
    private String city;
    private String zip;
    private String tin;
    private Timestamp date_created;
    private String status;
}

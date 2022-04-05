package com.thymmz.indiabazar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity(name = "Address")
public class Address {
    @Id
    private Integer id;
    private Integer object_id;
    private String object_type;
    private String addr_type;
    private String street;
    private String city;
    private String state;
    private String zip;
    private Timestamp date_created;
}

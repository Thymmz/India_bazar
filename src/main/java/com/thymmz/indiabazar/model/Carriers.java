package com.thymmz.indiabazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "Carriers")
public class Carriers {
    @Id
    private Integer id;
    private String name;
    private String tracker_link;
    private String status;
}

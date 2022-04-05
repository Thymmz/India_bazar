package com.thymmz.indiabazar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity(name = "Carriers")
public class Carriers {
    @Id
    private Integer id;
    private String name;
    private String tracker_link;
    private String status;
}

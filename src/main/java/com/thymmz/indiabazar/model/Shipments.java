package com.thymmz.indiabazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "Shipments")
public class Shipments {
    @Id
    private Integer id;
    private Integer po_id;
    private Integer item_id;
    private Integer quantity;
    private Integer storage_bin;
    private Timestamp picked_date;
    private Timestamp packed_date;
    private Timestamp ship_date;
    private Timestamp delivery_date;
    private Timestamp delivered_date;
    private Integer carrier_id;
    private String status;
}

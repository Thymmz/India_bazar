package com.thymmz.indiabazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "Po_items")
public class Po_items {
    @Id
    private Integer id;
    private Integer po_id;
    private short seq_no;
    private Integer item_id;
    private Integer quantity;
    private BigDecimal discount;
    private BigDecimal price;
    private String spl_instruct;
    private String status;
}

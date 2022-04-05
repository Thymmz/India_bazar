package com.thymmz.indiabazar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity(name = "Item")
public class Item {
    @Id
    private Integer id;
    private String name;
    private String description;
    private String sku_no;
    private BigDecimal weight;
    private String weight_units;
    private BigDecimal height;
    private BigDecimal width;
    private BigDecimal length;
    private String dim_units;
    private BigDecimal list_price;
    private BigDecimal max_discount;
    private String status;
}

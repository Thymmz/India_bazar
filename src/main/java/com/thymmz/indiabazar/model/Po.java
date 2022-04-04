package com.thymmz.indiabazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "Po")
public class Po {
    @Id @GeneratedValue
    private Integer id;
    private Timestamp po_date;
    private Integer cust_id;
    private Integer billing_addr;
    private Integer shipping_addr;
    private Integer order_qty;
    private BigDecimal items_total;
    private BigDecimal shipping_cost;
    private BigDecimal po_total;
    private Timestamp ship_date;
    private Timestamp delivery_date;
    private String status;
}

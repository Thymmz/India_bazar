package com.thymmz.indiabazar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity(name = "Customer")
public class Customer {
    @Id
    private Integer id;
    private String last;
    private String first;
    private String mobile;
    private String homephone;
    private String office_email;
    private String personal_email;
    private String status;
}

package com.thymmz.indiabazar.dao;

import com.thymmz.indiabazar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}

package com.thymmz.indiabazar.service.impl;

import com.thymmz.indiabazar.dao.CustomerDao;
import com.thymmz.indiabazar.model.Customer;
import com.thymmz.indiabazar.service.inter.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        Optional<Customer> customer = customerDao.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }
        else {
            return null;
        }
    }
}

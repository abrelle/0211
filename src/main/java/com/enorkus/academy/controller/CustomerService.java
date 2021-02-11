package com.enorkus.academy.controller;

import com.enorkus.academy.entity.Customer;
import com.enorkus.academy.validation.CustomerValidator;
import com.enorkus.academy.repository.CustomerRepository;
import com.enorkus.academy.repository.MemoryCustomerRepository;

import java.util.List;


public class CustomerService {

    private CustomerRepository customerRepository;
    private CustomerValidator customerValidator;

    public CustomerService() {
        this.customerRepository = new MemoryCustomerRepository();
        this.customerValidator = new CustomerValidator();
    }

    public List<Customer> fetchCustomers() {
        return customerRepository.findAll();
    }

    public void insertCustomer(Customer customer) {
        customerValidator.validate(customer, "Customer validation failed!");
        customerRepository.insert(Formatter.format(customer));
    }

    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }


}

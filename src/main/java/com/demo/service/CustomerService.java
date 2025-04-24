package com.demo.service;

import com.demo.entity.Customer;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface CustomerService {

    public void saveCustomersFromExcel(InputStream inputStream) throws IOException;
    public List<Customer> getAllCustomers();

}

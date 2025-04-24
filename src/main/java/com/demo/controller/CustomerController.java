package com.demo.controller;

import com.demo.entity.Customer;
import com.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("upload")
    public ResponseEntity<String> uploadExcelOfCustomers(@RequestParam("file") MultipartFile file) {
        try {
            service.saveCustomersFromExcel(file.getInputStream());
            return ResponseEntity.ok("File uploaded and data saved successfully.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @GetMapping("list")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }
}

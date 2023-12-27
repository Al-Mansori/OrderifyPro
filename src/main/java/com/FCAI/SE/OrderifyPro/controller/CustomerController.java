package com.FCAI.SE.OrderifyPro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FCAI.SE.OrderifyPro.model.Customer;
import com.FCAI.SE.OrderifyPro.model.Response;
import com.FCAI.SE.OrderifyPro.services.CustomerServiceImp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerServiceImp customerService;

    // @GetMapping("/habal")
    // public String habal() {

    // return "habal";
    // }

    @PostMapping("/createAccount")
    public Response createAccount(@RequestBody Customer customer) {
        boolean res = customerService.addAccount(customer);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("com.example.demo.Person Already Exists");
            return response;
        }

        response.setStatus(true);
        response.setMessage("com.example.demo.Person created successfully");
        return response;
    }
}

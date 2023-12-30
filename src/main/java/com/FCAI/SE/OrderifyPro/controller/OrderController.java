package com.FCAI.SE.OrderifyPro.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FCAI.SE.OrderifyPro.model.Account;
import com.FCAI.SE.OrderifyPro.model.SimpleOrder;
// import com.FCAI.SE.OrderifyPro.model.Response;
import com.FCAI.SE.OrderifyPro.services.CompoundOrderServiceImp;
import com.FCAI.SE.OrderifyPro.services.IOrderService;
import com.FCAI.SE.OrderifyPro.services.SimpleOrderServiceImp;

@RestController
@RequestMapping("/orders")
public class OrderController {
    IOrderService orderService;

    // RESTful endpoints for order management
    // @PostMapping("/simple")
    // public Response addSimpleOrder(@RequestBody SimpleOrder order) {
    //     orderService = new SimpleOrderServiceImp();
    //     boolean res = orderService.addOrder(order);
    //     Response response = new Response();
    //     if (!res) {
    //         response.setStatus(false);
    //         response.setMessage("com.example.demo.Person Already Exists");
    //         return response;
    //     }
    //     response.setStatus(true);
    //     response.setMessage("com.example.demo.Person created successfully");
    //     return response;
    // }

    // @PostMapping("/compound")
    // public Response addCompoundOrder(@RequestBody SimpleOrder order) {
    //     orderService = new CompoundOrderServiceImp();
    //     boolean res = orderService.addOrder(order);
    //     Response response = new Response();
    //     if (!res) {
    //         response.setStatus(false);
    //         response.setMessage("com.example.demo.Person Already Exists");
    //         return response;
    //     }
    //     response.setStatus(true);
    //     response.setMessage("com.example.demo.Person created successfully");
    //     return response;
    // }
}

package com.FCAI.SE.OrderifyPro.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FCAI.SE.OrderifyPro.model.Product;
import com.FCAI.SE.OrderifyPro.services.IProductService;

import java.util.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/products")
public class ProductController {
    IProductService productService;

    

    public ProductController(@Qualifier("productServiceImp") IProductService productService) {
        this.productService = productService;
    }



    @GetMapping("/getProducts")
    public List<Product> getMethodName() {
        return productService.getAllProducts();
    }
    


}
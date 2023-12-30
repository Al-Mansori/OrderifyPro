package com.FCAI.SE.OrderifyPro.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.FCAI.SE.OrderifyPro.model.Product;

@Service

public interface IProductService {
   public List<Product> getAllProducts();
}

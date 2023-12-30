package com.FCAI.SE.OrderifyPro.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.FCAI.SE.OrderifyPro.model.Product;
import com.FCAI.SE.OrderifyPro.repositories.ProductRepository;

@Service("productServiceImp")

public class ProductServiceImp implements IProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

}

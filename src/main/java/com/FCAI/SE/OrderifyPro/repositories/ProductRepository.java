package com.FCAI.SE.OrderifyPro.repositories;

import com.FCAI.SE.OrderifyPro.model.Product;
import com.FCAI.SE.OrderifyPro.model.ProductDefinition;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
        public static List<Product> products = new ArrayList<Product>();


        public List<Product> getAllProducts () {
            ProductDefinition pd1 = new ProductDefinition("12345", "mansoury", "AHmed", "human", 500);
            ProductDefinition pd2 = new ProductDefinition("123456", "Ahmed", "Mansoury", "human", 555);
            ProductDefinition pd3 = new ProductDefinition("1234567", "indomie", "indomie", "food", 8);

            Product p1 = new Product(pd1, 5);
            Product p2 = new Product(pd2, 9);
            Product p3 = new Product(pd3, 2);


            products.add(p1);
            products.add(p2);
            products.add(p3);


            return products;
        }
}

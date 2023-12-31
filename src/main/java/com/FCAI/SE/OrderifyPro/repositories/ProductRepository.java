package com.FCAI.SE.OrderifyPro.repositories;

import com.FCAI.SE.OrderifyPro.model.Product;
import com.FCAI.SE.OrderifyPro.model.ProductDefinition;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
        public static List<Product> products = new ArrayList<Product>();

        public Optional<Product> getProductById (UUID id) {
            return products.stream().filter(p1 -> p1.getDefinition().getSerialNumber().equals(id)).findAny();
        }


        public List<Product> getAllProducts () {
            ProductDefinition pd1 = new ProductDefinition(UUID.randomUUID(), "mansoury", "AHmed", "human", 500);
            ProductDefinition pd2 = new ProductDefinition(UUID.randomUUID(), "Ahmed", "Mansoury", "human", 555);
            ProductDefinition pd3 = new ProductDefinition(UUID.randomUUID(), "indomie", "indomie", "food", 8);

            Product p1 = new Product(pd1, 5);
            Product p2 = new Product(pd2, 9);
            Product p3 = new Product(pd3, 5);


            products.add(p1);
            products.add(p2);
            products.add(p3);


            return products;
        }
}

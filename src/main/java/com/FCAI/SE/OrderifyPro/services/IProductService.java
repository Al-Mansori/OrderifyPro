package com.FCAI.SE.OrderifyPro.services;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.stereotype.Service;

@Service

public interface IProductService {
   public Product[] getAllProducts();
}

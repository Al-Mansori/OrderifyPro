package com.FCAI.SE.OrderifyPro;

import org.apache.commons.math3.stat.descriptive.summary.Product;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.FCAI.SE.OrderifyPro.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eman.yehia
 */
public class Common {
    public static Map<Product, Integer> products = new HashMap<Product, Integer>();
    public static ArrayList<Customer> customers = new ArrayList<Customer>();
}

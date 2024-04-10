package org.example.shoppingapp.Service;

import org.example.shoppingapp.Entity.Product;
import org.example.shoppingapp.Repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }




}

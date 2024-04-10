package org.example.shoppingapp;

import org.example.shoppingapp.Entity.Inventory;
import org.example.shoppingapp.Service.InventoryServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class ShoppingAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShoppingAppApplication.class, args);

    }







}

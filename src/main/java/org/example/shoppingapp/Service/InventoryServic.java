package org.example.shoppingapp.Service;

import jakarta.annotation.PostConstruct;

import org.example.shoppingapp.Entity.Inventory;
import org.example.shoppingapp.Repos.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServic {

    @Autowired
    InventoryRepo inventoryRepo;

    @PostConstruct
    public void intializeInventory(){
        Inventory inventory = new Inventory();
        inventory.setAvailable(100);
        inventory.setOrdered(0);
        inventoryRepo.save(inventory);
    }


    public void decreaseAvailable(int quantity ){
        Inventory inventory = inventoryRepo.findAll().get(0);
        inventory.setAvailable(inventory.getAvailable()-quantity);
        inventory.setOrdered(inventory.getOrdered()+quantity);
        inventoryRepo.save(inventory);
    }



    public List<Inventory> getInventory(){
        return inventoryRepo.findAll();
    }

}

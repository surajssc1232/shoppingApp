package org.example.shoppingapp.Controller;

import org.example.shoppingapp.Entity.Inventory;
import org.example.shoppingapp.Service.InventoryServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@RestController
public class mainController {

    @Autowired
    InventoryServic inventoryServic;

    @GetMapping("/inventory")
    public List<Inventory> getAllInventory(){
        return inventoryServic.getInventory();
    }
}

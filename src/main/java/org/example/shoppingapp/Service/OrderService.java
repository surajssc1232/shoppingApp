package org.example.shoppingapp.Service;

import org.example.shoppingapp.Entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    InventoryServic inventoryServic;

    public void placeOrder(Orders order){
        inventoryServic.decreaseAvailable(order.getQuantity());
    }
}

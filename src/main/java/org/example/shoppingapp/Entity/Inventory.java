package org.example.shoppingapp.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int ordered;
    private int available;
    private double price;

    @JsonIgnore
    public Long getId() {
        return (long) id;
    }


}

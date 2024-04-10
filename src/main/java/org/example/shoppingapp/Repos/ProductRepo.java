package org.example.shoppingapp.Repos;

import org.example.shoppingapp.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {


}

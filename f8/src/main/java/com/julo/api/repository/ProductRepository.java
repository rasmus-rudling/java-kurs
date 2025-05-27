package com.julo.api.repository;

import com.julo.api.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    public List<Product> findAll() {
        double random = Math.random();

        if (random < 0.5) {
            throw new RuntimeException("Something went wrong");
        }

        return List.of(
            new Product(0L, "Datorskärm", 3000L),
            new Product(0L, "Mobil", 5000L)
        );
    }
}

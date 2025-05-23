package com.julo.api.controller;

import com.julo.api.domain.Product;
import com.julo.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll() {
        return this.productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable String id) {
        return id;
    }
}

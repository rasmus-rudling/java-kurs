package com.julo.api.domain;

import jakarta.validation.constraints.*;

import java.util.List;

public class Product {
    private Long id;

    @NotEmpty()
    private String name;

    @Size(min = 0, max = 5)
    private List<String> nameAlias;

    @Min(0)
    @Max(100000)
    private Long price;


    public Product(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}

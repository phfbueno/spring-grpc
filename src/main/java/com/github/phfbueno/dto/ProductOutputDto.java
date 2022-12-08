package com.github.phfbueno.dto;

public class ProductOutputDto {
    private Long id;
    private String name;
    private Double price;
    private Integer quantityInStock;

    public ProductOutputDto(long id, String name, Double price, Integer quantityInStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }
}

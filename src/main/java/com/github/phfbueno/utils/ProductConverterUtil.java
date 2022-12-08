package com.github.phfbueno.utils;

import com.github.phfbueno.domain.Product;
import com.github.phfbueno.dto.ProductInputDto;
import com.github.phfbueno.dto.ProductOutputDto;

public class ProductConverterUtil {

    public static ProductOutputDto productToProductOutputDto(Product product) {
        return new ProductOutputDto(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getQuantityInStock()
        );
    }

    public static Product productToProductIntputDto(ProductInputDto productInputDto) {
        return  new Product(
                null,
                productInputDto.getName(),
                productInputDto.getPrice(),
                productInputDto.getQuantityInStock()

        );
    }

}

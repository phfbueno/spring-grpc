package com.github.phfbueno.service;

import com.github.phfbueno.dto.ProductInputDto;
import com.github.phfbueno.dto.ProductOutputDto;

import java.util.List;

public interface IProductService {
    ProductOutputDto create(ProductInputDto productInputDto);
    ProductOutputDto findById(Long id);
    void delete(Long id);
    List<ProductOutputDto> findAll();
}

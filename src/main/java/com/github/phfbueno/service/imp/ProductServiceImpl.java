package com.github.phfbueno.service.imp;

import com.github.phfbueno.dto.ProductInputDto;
import com.github.phfbueno.dto.ProductOutputDto;
import com.github.phfbueno.repository.ProductRepository;
import com.github.phfbueno.service.IProductService;
import com.github.phfbueno.utils.ProductConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductOutputDto create(ProductInputDto productInputDto) {
       var product = ProductConverterUtil.productToProductIntputDto(productInputDto);
       var productCreate = this.productRepository.save(product);
       return ProductConverterUtil.productToProductOutputDto(productCreate);
    }

    @Override
    public ProductOutputDto findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ProductOutputDto> findAll() {
        return null;
    }
}

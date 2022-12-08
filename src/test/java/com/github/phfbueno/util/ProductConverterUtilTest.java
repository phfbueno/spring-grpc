package com.github.phfbueno.util;

import com.github.phfbueno.domain.Product;
import com.github.phfbueno.dto.ProductInputDto;
import com.github.phfbueno.utils.ProductConverterUtil;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductConverterUtilTest {

    @Test
    public void productToProductOutputDtoTest() {
        var product = new Product(1L, "product name", 10.00, 10);
        var productOutputDto = ProductConverterUtil
                .productToProductOutputDto(product);

        Assertions.assertThat(product)
                .usingRecursiveComparison()
                .isEqualTo(productOutputDto);
    }

    @Test
    public void productIntputDtoToProductTest() {
        var productInputDto = new ProductInputDto( "product name", 10.00, 10);
        var product = ProductConverterUtil
                .productToProductIntputDto(productInputDto);

        Assertions.assertThat(productInputDto)
                .usingRecursiveComparison()
                .isEqualTo(product );
    }
}

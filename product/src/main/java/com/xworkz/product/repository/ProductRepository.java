package com.xworkz.product.repository;

import com.xworkz.product.dto.ProductDTO;

public interface ProductRepository {

    boolean save(ProductDTO productDTO);
}

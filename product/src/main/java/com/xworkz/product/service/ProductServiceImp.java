package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    ProductRepository  productRepository;
    @Override
    public boolean validAndSave(ProductDTO productDTO) {
        boolean saved=productRepository.save(productDTO);
        return saved;
    }
}

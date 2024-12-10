package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService{
    @Override
    public boolean validAndSave(ProductDTO productDTO) {
        return true;
    }
}

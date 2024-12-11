package com.xworkz.product.repository;

import com.xworkz.product.dto.ProductDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImp implements ProductRepository{
    @Override
    public boolean save(ProductDTO productDTO) {
        System.out.println("runnning save in ProductRepositoryImp");
        return true;
    }
}

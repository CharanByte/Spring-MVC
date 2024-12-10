package com.xworkz.product.controller;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService productService;
    ProductController(){
        System.out.println("running productController");
    }

    @PostMapping("/product")
    public String save(ProductDTO productDTO, Model model){
        System.out.println(productDTO);
        boolean save=productService.validAndSave(productDTO);
        if(save) {
            model.addAttribute("success", "Product details saved Successfully");
            model.addAttribute("save",productDTO);
            return "ProductSuccess.jsp";
        }
        else{
            model.addAttribute("failure","Error saving product");
            model.addAttribute("dto",productDTO);
        }
        return "Product.jsp";
    }
}

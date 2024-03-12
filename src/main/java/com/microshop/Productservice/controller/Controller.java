package com.microshop.Productservice.controller;

import com.microshop.Productservice.productservice.ProductService;
import com.microshop.Productservice.repo.Repositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map")
public class Controller {

    @Autowired
    Repositiory repo;

    @GetMapping("/get")
    public List<ProductService> productService()
    {
       return repo.findAll();
    }
}

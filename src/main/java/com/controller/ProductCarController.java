package com.controller;

import com.dao.ProductCarRepository;
import com.entity.ProductCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCarController {
    @Autowired
    private ProductCarRepository productCarRepository;
    @GetMapping("/car/{code}")
    public ProductCar findById(@PathVariable String code){
        ProductCar car = productCarRepository.findOne(code);
        return car;
    }
}

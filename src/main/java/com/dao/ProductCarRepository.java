package com.dao;

import com.entity.ProductCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCarRepository extends JpaRepository<ProductCar,String> {
}

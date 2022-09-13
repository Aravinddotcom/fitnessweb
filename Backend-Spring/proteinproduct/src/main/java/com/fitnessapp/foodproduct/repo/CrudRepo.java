package com.fitnessapp.foodproduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitnessapp.foodproduct.model.Product;

public interface CrudRepo extends JpaRepository<Product, Integer>{

}

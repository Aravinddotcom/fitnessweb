package com.fitnessapp.caloriesproduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitnessapp.caloriesproduct.model.Product;

public interface CrudRepo extends JpaRepository<Product, Integer>{

}

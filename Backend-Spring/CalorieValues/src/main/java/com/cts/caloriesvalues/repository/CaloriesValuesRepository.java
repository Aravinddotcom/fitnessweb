package com.cts.caloriesvalues.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.caloriesvalues.model.CaloriesValues;

@Repository
public interface CaloriesValuesRepository extends JpaRepository<CaloriesValues, Integer> {

	public List<CaloriesValues> findAll();
	public CaloriesValues findByfoodName(String foodName);
}

package com.cts.fitnessweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.fitnessweb.model.Protein;

@Repository
public interface ProteinRepository extends JpaRepository<Protein, Integer> {
	public List<Protein> findAll();
	public Protein findByProductName(String productName);

}

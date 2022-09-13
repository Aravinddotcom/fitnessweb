package com.cts.fitnessweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.fitnessweb.exception.ProteinNotFoundException;
import com.cts.fitnessweb.model.Protein;
import com.cts.fitnessweb.repository.ProteinRepository;

@Service
public class ProteinService {
	
	@Autowired
	private ProteinRepository stockRepository;
	
	public List<Protein> findAll() throws ProteinNotFoundException{
		List<Protein> stockList=stockRepository.findAll();
		if(stockList.isEmpty()) {
			throw new ProteinNotFoundException("Product is not available");
		}
		return stockList;
	}
	
	public Protein getStockDetail(String productName) throws ProteinNotFoundException {
		Protein stock=stockRepository.findByProductName(productName);
		if(stock==null) {
			throw new ProteinNotFoundException("Product is not available");
		}
		return stock;
	}

}

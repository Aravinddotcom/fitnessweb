package com.cts.caloriesvalues.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.caloriesvalues.exception.CaloriesValuesNotFoundException;
import com.cts.caloriesvalues.model.CaloriesValues;
import com.cts.caloriesvalues.repository.CaloriesValuesRepository;

@Service
public class CaloriesValuesService {
	
	@Autowired
	private CaloriesValuesRepository mutualFundRepository;	
	
	public List<CaloriesValues> getAll() throws CaloriesValuesNotFoundException{
		
		List<CaloriesValues> mf=mutualFundRepository.findAll();
		if(mf.isEmpty()) {
			throw new CaloriesValuesNotFoundException("food not Available");
		}
		return mf;
	}
	
	
	public CaloriesValues getByfoodName(String mfName) throws CaloriesValuesNotFoundException {
		CaloriesValues mf=mutualFundRepository.findByfoodName(mfName);
		if(mf==null) {
			throw new CaloriesValuesNotFoundException("food not Available");
		}
		return mf;
	}

}

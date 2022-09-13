package com.cts.caloriesvalues.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.caloriesvalues.exception.CaloriesValuesNotFoundException;
import com.cts.caloriesvalues.feignclient.AuthorizationClient;
import com.cts.caloriesvalues.model.CaloriesValues;
import com.cts.caloriesvalues.service.CaloriesValuesService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/CaloriesValues")
public class CaloriesValuesController {

	@Autowired
	private CaloriesValuesService mutualFundService;

	@Autowired
	private AuthorizationClient authorizationClient;

	@GetMapping(value = "/{foodName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CaloriesValues getMutualFundDetails(@RequestHeader("Authorization") String authorization,
			@PathVariable String foodName) throws CaloriesValuesNotFoundException {
		authorizationClient.getUname(authorization);
		log.info("Fetching Food using MutualName");
		return mutualFundService.getByfoodName(foodName);
	}
	
	@GetMapping(value="/allfood", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CaloriesValues> getAllMutualFund(@RequestHeader("Authorization") String authorization) throws CaloriesValuesNotFoundException
	{
		authorizationClient.getUname(authorization);
		return mutualFundService.getAll();
	}

}

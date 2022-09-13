package com.cts.fitnessweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.fitnessweb.exception.ProteinNotFoundException;
import com.cts.fitnessweb.feigclient.AuthorizationClient;
import com.cts.fitnessweb.model.Protein;
import com.cts.fitnessweb.service.ProteinService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/Protein")
public class ProteinController {
	
	@Autowired
	private ProteinService stockService;
	
	@Autowired
	private AuthorizationClient authorizationClient;
	
	@GetMapping(value="/{productName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Protein getStockDetail(@RequestHeader("Authorization") String authorization,@PathVariable String productName) throws ProteinNotFoundException {
		authorizationClient.getUname(authorization);
		log.info("fetching Product Details using productName");
		return stockService.getStockDetail(productName);
	}
	
	@GetMapping(value="/allprotein", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Protein> getAllStockDetails(@RequestHeader("Authorization") String authorization) throws ProteinNotFoundException
	{
		authorizationClient.getUname(authorization);
		return stockService.findAll();
	}
	
}

package com.fitnessapp.caloriesproduct.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fitnessapp.caloriesproduct.model.Product;
import com.fitnessapp.caloriesproduct.services.CrudService;

@RestController

public class CrudRestController {
	
	@Autowired
	private CrudService service;
	
	
	@GetMapping("/getproductlist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Product> fetchProductList(){
		List<Product> products = new ArrayList<Product>();
		//logic to fetch list from database
		products = service.fetchProductList();
		return products;
	}
	
	@PostMapping("/addproduct")
	@CrossOrigin(origins = "http://localhost:4200")
	public Product saveproduct(@RequestBody Product product){
		return service.saveProductToDB(product);
	}
	
	@GetMapping("/getproductbyid/{foodId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Product fetchProductById(@PathVariable int foodId){
		return service.fetchProductById(foodId).get();
		
	}
	   @PostMapping("/editproduct")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public String updateProduct(@RequestBody Product product){
	        //Logic to get update product from database
	        return service.updateProductInRepository(product);
	    }

	    @DeleteMapping("/product/{foodId}")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public String deleteProduct(@PathVariable int foodId){
	        //Logic to get delete product by id from database


	        return service.deleteProductById(foodId);
	    }
	    
//	@DeleteMapping("/deleteproductbyid/{id}")
//	@CrossOrigin(origins = "http://localhost:4200")
//	public String deleteProductById(@PathVariable int id){
//		return service.deleteProductById(id);
//	}
	
}

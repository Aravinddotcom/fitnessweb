package com.fitnessapp.caloriesproduct.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitnessapp.caloriesproduct.model.Product;
import com.fitnessapp.caloriesproduct.repo.CrudRepo;

@Service
public class CrudService {
	
	@Autowired
	private CrudRepo repo;
	
    private Product productToUpdate;
	
	public ArrayList<Product> fetchProductList(){
		return (ArrayList<Product>)repo.findAll();
	}
	
	public Product saveProductToDB(Product product) {
		return repo.save(product);
	}
	
	public Optional<Product> fetchProductById(int foodId) {
		return repo.findById(foodId);
	}
	
//	public String deleteProductById(int id) {
//		String result;
//		try {
//			repo.deleteById(id);	
//			result = "Product deleted successfully";
//		}catch(Exception e) {
//			result = "Product with id not deleted";
//		}
//		return result;
//		
//	}

    public String updateProductInRepository(Product product) {
        try {
            productToUpdate = repo.getOne(product.getId());

            productToUpdate.setName(product.getName());
            productToUpdate.setDesc(product.getDesc());
            productToUpdate.setPrice(product.getPrice());
            productToUpdate.setProtein(product.getProtein());
            repo.save(productToUpdate);
            return "Product Updated";
        }catch (Exception e){
            return "There is no product registered under the ID: "+product.getId()+"\nMake sure you you send a valid product!";
        }
    }
	
	public String deleteProductById(int foodId) {
        try
        {
            repo.deleteById(foodId);
            return "Product Deleted Successfully";
        }catch (Exception e){
            return "Product not found";
        }

    }

}

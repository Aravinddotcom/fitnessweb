package com.fitnessapp.foodproduct.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitnessapp.foodproduct.model.Product;
import com.fitnessapp.foodproduct.repo.CrudRepo;

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
	
	public Optional<Product> fetchProductById(int stockId) {
		return repo.findById(stockId);
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
	
	public String deleteProductById(int stockId) {
        try
        {
            repo.deleteById(stockId);
            return "Product Deleted Successfully";
        }catch (Exception e){
            return "Product not found";
        }

    }

}

package com.spring.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringBoot.dao.ProductRepository;
import com.spring.SpringBoot.entity.Product;

@Service
public class ProductService {
		@Autowired
		ProductRepository repo;
		
		public List<Product> getProducts(){
			return repo.findAll();	
		}
		public Product getProductById(int pid) {		
			return repo.getById(pid);		
		}
		public void saveProduct(Product p) {
			repo.save(p);
		}
}
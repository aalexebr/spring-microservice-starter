package org.spring.product_service.service;
import java.util.List;

import org.spring.product_service.model.Product;
import org.spring.product_service.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class ProductService {
	
	@Autowired ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	public void save(Product p) {
		productRepository.save(p);
	}
}

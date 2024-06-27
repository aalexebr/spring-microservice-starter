package org.spring.product_service.controller;

import java.util.List;

import org.spring.product_service.model.Product;
import org.spring.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("api/product")
@AllArgsConstructor
public class ProductController {
	
	@Autowired ProductService productService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAll() {
		List<Product> p = productService.findAll();
		return new ResponseEntity<>(p, HttpStatus.OK);
	}
	
	@GetMapping("test") 
	public ResponseEntity<Boolean> test(){
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	@GetMapping("test2") 
	public ResponseEntity<String> test2(){
		return new ResponseEntity<>("feign is working ", HttpStatus.OK);
	}

}

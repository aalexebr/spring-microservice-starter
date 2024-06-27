package org.spring.product_service;

import org.spring.product_service.model.Product;
import org.spring.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner{
	
	@Autowired ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product p1 = new Product("product1","0001");
		Product p2 = new Product("product2","0002");
		Product p3 = new Product("product3","0003");
		Product p4 = new Product("product4","0004");
		
		productService.save(p1);
		productService.save(p2);
		productService.save(p3);
		productService.save(p4);
	}

}

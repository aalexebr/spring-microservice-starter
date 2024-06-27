package org.spring.order_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface OrderServiceClient {
	
	@GetMapping("api/product/test")
	boolean test();
	
	@GetMapping("api/product/test2")
	String test2();
}

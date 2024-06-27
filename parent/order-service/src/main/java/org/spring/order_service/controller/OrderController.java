package org.spring.order_service.controller;

import org.spring.order_service.dto.OrderDto;
import org.spring.order_service.service.FeignService;
import org.spring.order_service.service.OrderItemsService;
import org.spring.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/orders")
@AllArgsConstructor
public class OrderController {
	
	@Autowired OrderService orderService;
	@Autowired OrderItemsService orderItemService;
	@Autowired FeignService feignService;
	
	@PostMapping("")
	public ResponseEntity<String> postMethodName(@RequestBody OrderDto entity) {
		
		return new ResponseEntity<>("ok", HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public ResponseEntity<Boolean> getMethodName() throws Exception {
		boolean b = feignService.test();
		return new ResponseEntity<>(b, HttpStatus.OK);
	}
	
	@GetMapping("/test2")
	public ResponseEntity<String> getMethodName2() throws Exception {
		return new ResponseEntity<>(feignService.test2(), HttpStatus.OK);
	}
	
}
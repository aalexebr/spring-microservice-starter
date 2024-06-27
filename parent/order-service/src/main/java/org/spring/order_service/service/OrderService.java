package org.spring.order_service.service;

import java.util.List;

import org.spring.order_service.model.Order;
import org.spring.order_service.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public void save(Order o) {
		orderRepository.save(o);
	}

}

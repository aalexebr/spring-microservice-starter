package org.spring.order_service.service;

import org.spring.order_service.model.OrderItems;
import org.spring.order_service.repo.OrderItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemsService {
	@Autowired OrderItemsRepository orderItemsRepo;
	
	public void save(OrderItems o) {
		orderItemsRepo.save(o);
	}
}

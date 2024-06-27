package org.spring.order_service.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FeignService {
	
	private OrderServiceClient client;
	
	public boolean test() throws Exception {
		boolean b = client.test();

		return b;
	}
	
	public String test2() {
		return client.test2();
	}
	

}

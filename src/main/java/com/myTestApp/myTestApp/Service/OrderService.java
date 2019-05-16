package com.myTestApp.myTestApp.Service;

import org.springframework.stereotype.Service;

import com.myTestApp.myTestApp.model.Order;
import com.myTestApp.myTestApp.repository.OrderRepository;

@Service("orderService")
public class OrderService {
	
	private OrderRepository orderRepository;

	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	public void save(Order order) {
		orderRepository.save(order);
	}
	private Long nr = (long) 1;
	
	public Order getOne() {
		return orderRepository.findById(nr).get();
		
	}
	
	
}

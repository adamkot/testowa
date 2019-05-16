package com.myTestApp.myTestApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myTestApp.myTestApp.model.Order;

@Repository("orderRepository")
public interface OrderRepository extends CrudRepository<Order, Long> {

}

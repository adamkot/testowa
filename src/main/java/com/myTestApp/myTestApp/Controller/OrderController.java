package com.myTestApp.myTestApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myTestApp.myTestApp.Service.OrderService;
import com.myTestApp.myTestApp.model.Order;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value = "/zamow", method = RequestMethod.GET)
	public ModelAndView zamow() {
		Order order = new Order();
		order = orderService.getOne();
		orderService.save(order);
		ModelAndView modelAndView = new ModelAndView();	
		modelAndView.addObject("tresc", order);
		modelAndView.setViewName("zamow");
		return modelAndView;
	}
}

package com.nagarro.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.model.OrderDto;
import com.nagarro.service.OrderService;

@RestController
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService ordrSrvce;
	
	@GetMapping("/orders/{userId}")
	public List<OrderDto> getUserOrderList(@PathVariable("userId") String usrId) {
		
		logger.info("getUserOrderList method of controller layer executed with UserId: "+ usrId);
		
		return ordrSrvce.getUserOrderList(Integer.parseInt(usrId));
	}

}

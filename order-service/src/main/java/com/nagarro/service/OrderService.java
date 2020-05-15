package com.nagarro.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagarro.dao.OrderRepository;
import com.nagarro.model.OrderDto;

@Service
public class OrderService {	
	
	@Autowired
	private OrderRepository ordrRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);
	
	public List<OrderDto> getUserOrderList(Integer usrId) {
		
		logger.info("getUserOrderList method of OrderService executed with userId: "+usrId);
		
		return ordrRepo.getUserList(usrId);
	}

}

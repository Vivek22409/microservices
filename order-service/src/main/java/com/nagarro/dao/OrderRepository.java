package com.nagarro.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nagarro.model.OrderDto;
import com.nagarro.service.OrderService;

@Repository
public class OrderRepository {
	
	private static List<OrderDto> orderList = new ArrayList<OrderDto>();
	
	private static final Logger logger = LoggerFactory.getLogger(OrderRepository.class);
	
	static {
		
		logger.info("orderList created for specific userId");
		
		orderList.add(new OrderDto(1,250d,"14-Apr-2020"));
		orderList.add(new OrderDto(2,450d,"15-Apr-2020"));
	}
	
	public List<OrderDto> getUserList(Integer usrId){
		
		logger.info("getUserList of OrderRepository executed with userId: "+usrId);
		
		return orderList;
	}

}

package com.nagarro.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.nagarro.model.OrderDto;
import com.nagarro.model.UserDto;
import com.nagarro.model.UserOrderDto;


@RestController
public class UserOrderAggregatorController {

	@Autowired
	private RestTemplate rstTmplate;

	@Value("${user.service.url}")
	private String USER_SERVICE_URL;
	@Value("${order.service.url}")
	private String ORDER_SERVICE_URL;

	private static final Logger logger = LoggerFactory.getLogger(UserOrderAggregatorController.class);

	@GetMapping("/orderdetails/{userId}")
	@SuppressWarnings("unchecked")
	public UserOrderDto getUserOrderdetails(@PathVariable("userId") String usrId) {
		
		logger.info("getUserOrderdetails method from controller layer started...");
		
		UserDto usrDto = rstTmplate.getForObject(USER_SERVICE_URL + "/user/" + usrId, UserDto.class);		
		List<OrderDto> ordrDtoList = rstTmplate.getForObject(ORDER_SERVICE_URL + "/orders/" + usrId, ArrayList.class);
		UserOrderDto usrOrdrDto = new UserOrderDto();
		usrOrdrDto.setUsrDto(usrDto);
		usrOrdrDto.setUsrOrdrLst(ordrDtoList);
		
		logger.info("getUserOrderdetails method from controller layer ends...");

		return usrOrdrDto;
	}

}

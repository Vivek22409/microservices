package com.nagarro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.exception.ResourceNotFoundException;
import com.nagarro.model.ResponseDto;
import com.nagarro.model.UserDto;
import com.nagarro.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService usrSrvce;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/message")
	public String testMethod() {
		return "Hello";
	}

	@GetMapping("/user/{userId}")
	public UserDto getUser(@PathVariable("userId") String usrId) throws ResourceNotFoundException {
		
		logger.info("getUser of UserController executed with userId: "+usrId);
		
		Integer userId = Integer.parseInt(usrId);
		UserDto usrDto = usrSrvce.getUser(userId);

		return usrDto;
	}

}

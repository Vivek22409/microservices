package com.nagarro.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.controller.UserController;
import com.nagarro.dao.UserRepository;
import com.nagarro.entity.User;
import com.nagarro.exception.ResourceNotFoundException;
import com.nagarro.model.UserDto;

@Service
public class UserService {

	@Autowired
	private UserRepository usrRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	public UserDto getUser(Integer usrId) throws ResourceNotFoundException {
		Optional<User> optUsr = usrRepo.findById(usrId);
		User usr = optUsr.orElseThrow(() -> new ResourceNotFoundException("The requested resource not found"));
		UserDto usrDto = new UserDto(usr.getEmail(), usr.getName(), usr.getAge());
		return usrDto;
	}

}

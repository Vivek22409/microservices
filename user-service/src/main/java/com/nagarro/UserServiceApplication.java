package com.nagarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nagarro.dao.UserRepository;
import com.nagarro.entity.User;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository usrRepo;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User usr = new User("john.doe@google.com","John","23");
		usrRepo.save(usr);		
	}

}

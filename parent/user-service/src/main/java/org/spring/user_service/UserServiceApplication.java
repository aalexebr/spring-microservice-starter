package org.spring.user_service;

import org.spring.user_service.model.User;
import org.spring.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner{
	@Autowired UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User("user1","user1@email.net","pswd");
		User u2 = new User("user2","user2@email.net","pswd");
		User u3 = new User("user3","user3@email.net","pswd");
		
		userService.save(u1);
		userService.save(u2);
		userService.save(u3);
	}

}

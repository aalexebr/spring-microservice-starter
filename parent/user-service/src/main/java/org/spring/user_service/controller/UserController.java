package org.spring.user_service.controller;

import java.util.List;

import org.spring.user_service.model.User;
import org.spring.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
	
	@Autowired UserService userService;
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> list = userService.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	
	

}

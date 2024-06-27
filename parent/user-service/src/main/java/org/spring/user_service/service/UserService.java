package org.spring.user_service.service;

import java.util.List;
import java.util.Optional;

import org.spring.user_service.model.User;
import org.spring.user_service.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
public class UserService {
	
	@Autowired UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
	}
	
	public void save(User u) {
		userRepository.save(u);
	}

}

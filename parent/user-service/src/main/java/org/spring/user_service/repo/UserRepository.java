package org.spring.user_service.repo;

import java.util.Optional;

import org.spring.user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findById(Integer id);
	Optional<User> findByUsername(String u);
	Optional<User> findByEmail(String u);
}

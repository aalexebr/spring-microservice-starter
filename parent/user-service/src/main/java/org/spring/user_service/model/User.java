package org.spring.user_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @Column(nullable = false, length = 16, unique = true)
    @Size(min = 4, max = 50, message = "Name must be between 4 and 16 characters")
	private String username;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, length = 8)
    @Size(min = 4, max = 50, message = "Password must be between 4 and 8 characters")
	private String password;
	
	private boolean isDeleted = false;
	
	public User(String username, String email, String pswd) {
		setUsername(username);
		setEmail(email);
		setPassword(pswd);
	}
	

}
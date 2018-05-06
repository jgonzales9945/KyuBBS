package com.revature.kyubbs.models;

public class AuthUser {
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "KB_USER")
public class AuthUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AUTHUSER_ID")
	private Long userId;

	@Column(name = "USER_NAME")
	@NotNull
	private String username;

	@Column(name="USER_TYPE_ID")
	@NotNull
	private Long userTypeId;

	public AuthUser() {
		// TODO Auto-generated constructor stub
	}

}
>>>>>>> f56ff0bdcdb432613bb5f9ab7995fc3a38fd5f99

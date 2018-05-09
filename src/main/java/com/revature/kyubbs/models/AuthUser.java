package com.revature.kyubbs.models;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KB_AUTH_USER_LIST")
public class AuthUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AUTH_USER_ID")
	private Long userId;

	@Column(name = "USER_NAME")
	@NotNull
	private String username;


	@NotNull
	private Long userTypeId;

	public AuthUser() {
		super();
	}

	public AuthUser(Long userId, @NotNull String username, @NotNull Long userTypeId) {
		super();
		this.userId = userId;
		this.username = username;
		this.userTypeId = userTypeId;
	}

	public AuthUser(@NotNull String username, @NotNull Long userTypeId) {
		super();
		this.username = username;
		this.userTypeId = userTypeId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@ManyToOne(targetEntity = UserType.class)
	@JoinColumn(name="USER_TYPE_ID")
	public Long getUserTypeId() {
		return userTypeId;
	}

	@ManyToOne(targetEntity = UserType.class)
	@JoinColumn(name="USER_TYPE_ID")
	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userTypeId == null) ? 0 : userTypeId.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthUser other = (AuthUser) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userTypeId == null) {
			if (other.userTypeId != null)
				return false;
		} else if (!userTypeId.equals(other.userTypeId))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AuthUser [userId=" + userId + ", username=" + username + ", userTypeId=" + userTypeId + "]";
	}
}

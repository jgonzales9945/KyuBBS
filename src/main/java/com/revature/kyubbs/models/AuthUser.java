package com.revature.kyubbs.models;

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
@Table(name = "KYUBBS_USER")
public class AuthUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AUTHUSER_ID")
	private Long user_id;

	@Column(name = "USER_NAME")
	@NotNull
	private String username;

	@Column(name="USER_TYPE_ID")
	@NotNull
	private Long userTypeId;

	public AuthUser() {
		super();
	}

	public AuthUser(Long user_id, @NotNull String username, @NotNull Long userTypeId) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.userTypeId = userTypeId;
	}

	public AuthUser(@NotNull String username, @NotNull Long userTypeId) {
		super();
		this.username = username;
		this.userTypeId = userTypeId;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getUserTypeId() {
		return userTypeId;
	}

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
		result = prime * result + ((userTypeId == null) ? 0 : userTypeId.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		if (userTypeId == null) {
			if (other.userTypeId != null)
				return false;
		} else if (!userTypeId.equals(other.userTypeId))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
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
		return "AuthUser [user_id=" + user_id + ", username=" + username + ", userTypeId=" + userTypeId + "]";
	}
}
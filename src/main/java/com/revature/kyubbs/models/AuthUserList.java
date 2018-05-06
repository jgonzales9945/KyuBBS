package com.revature.kyubbs.models;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KB_AUTH_USER_LIST")
public class AuthUserList implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="AUTH_USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long authUserId;
	
	@Column(name="USER_NAME")
	@NotNull
	private String userName;
	
	@Column(name="USER_TYPE_ID")
	private int userTypeId;

	public AuthUserList(Long authUserId, @NotNull String userName, int userTypeId) {
		super();
		this.authUserId = authUserId;
		this.userName = userName;
		this.userTypeId = userTypeId;
	}

	public AuthUserList() {
		super();
	}

	public AuthUserList(@NotNull String userName, int userTypeId) {
		super();
		this.userName = userName;
		this.userTypeId = userTypeId;
	}

	public Long getAuthUserId() {
		return authUserId;
	}

	public void setAuthUserId(Long authUserId) {
		this.authUserId = authUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authUserId == null) ? 0 : authUserId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + userTypeId;
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
		AuthUserList other = (AuthUserList) obj;
		if (authUserId == null) {
			if (other.authUserId != null)
				return false;
		} else if (!authUserId.equals(other.authUserId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userTypeId != other.userTypeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AuthUserList [authUserId=" + authUserId + ", userName=" + userName + ", userTypeId=" + userTypeId + "]";
	}
	
	
}

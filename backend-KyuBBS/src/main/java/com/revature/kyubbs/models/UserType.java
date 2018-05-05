package com.revature.kyubbs.models;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KB_USER_TYPE")
public class UserType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="USER_TYPE_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userTypeId;
	
	@Column(name="USER_ACCOUNT")
	private String userAccount;
	
	public UserType() {
		super();
	}

	public UserType(String userAccount) {
		super();
		this.userAccount = userAccount;
	}

	public UserType(Long userTypeId, String userAccount) {
		super();
		this.userTypeId = userTypeId;
		this.userAccount = userAccount;
	}

	public Long getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userAccount == null) ? 0 : userAccount.hashCode());
		result = prime * result + ((userTypeId == null) ? 0 : userTypeId.hashCode());
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
		UserType other = (UserType) obj;
		if (userAccount == null) {
			if (other.userAccount != null)
				return false;
		} else if (!userAccount.equals(other.userAccount))
			return false;
		if (userTypeId == null) {
			if (other.userTypeId != null)
				return false;
		} else if (!userTypeId.equals(other.userTypeId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserType [userTypeId=" + userTypeId + ", userAccount=" + userAccount + "]";
	}
	
	
}

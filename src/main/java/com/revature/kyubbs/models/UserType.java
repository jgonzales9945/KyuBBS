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
@Table(name="KB_USER_TYPE")
public class UserType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="USER_TYPE_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long typeId;
	
	@Column(name="USER_ACCOUNT")
	@NotNull
	private String account;

	public UserType(Long typeId, @NotNull String account) {
		super();
		this.typeId = typeId;
		this.account = account;
	}

	public UserType() {
		super();
	}

	public UserType(@NotNull String account) {
		super();
		this.account = account;
	}

	public Long getTypeId() { return typeId; }
	public void setTypeId(Long typeId) { this.typeId = typeId; }

	public String getAccount() { return account; }
	public void setAccount(String account) { this.account = account; }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
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
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (typeId == null) {
			if (other.typeId != null)
				return false;
		} else if (!typeId.equals(other.typeId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserType [typeId=" + typeId + ", account=" + account + "]";
	}
}

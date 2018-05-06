package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KB_BANNED_IP")
public class BannedIP implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="BANNED_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long bannedId;

	@Column(name="IP_ADDRESS", unique=true)
	@NotNull
	private String ipAddress;
	
	@Column(name="START_DATE")
	@NotNull
	private Timestamp startDate;
	
	@Column(name="EXP_DATE")
	private Timestamp expDate;

	public BannedIP(Long bannedId, @NotNull String ipAddress, @NotNull Timestamp startDate, Timestamp expDate) {
		super();
		this.bannedId = bannedId;
		this.ipAddress = ipAddress;
		this.startDate = startDate;
		this.expDate = expDate;
	}

	public BannedIP() {
		super();
	}

	public BannedIP(@NotNull String ipAddress, Timestamp expDate) {
		super();
		this.ipAddress = ipAddress;
		this.expDate = expDate;
	}

	public Long getBannedId() {
		return bannedId;
	}

	public void setBannedId(Long bannedId) {
		this.bannedId = bannedId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getExpDate() {
		return expDate;
	}

	public void setExpDate(Timestamp expDate) {
		this.expDate = expDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bannedId == null) ? 0 : bannedId.hashCode());
		result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		BannedIP other = (BannedIP) obj;
		if (bannedId == null) {
			if (other.bannedId != null)
				return false;
		} else if (!bannedId.equals(other.bannedId))
			return false;
		if (expDate == null) {
			if (other.expDate != null)
				return false;
		} else if (!expDate.equals(other.expDate))
			return false;
		if (ipAddress == null) {
			if (other.ipAddress != null)
				return false;
		} else if (!ipAddress.equals(other.ipAddress))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BannedIP [bannedId=" + bannedId + ", ipAddress=" + ipAddress + ", startDate=" + startDate + ", expDate="
				+ expDate + "]";
	}
	
	
}

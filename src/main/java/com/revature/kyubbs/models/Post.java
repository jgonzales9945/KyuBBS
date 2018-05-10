package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "KB_POSTS")
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "POST_ID")
	private Long id;

	@Column(name = "POST_NAME")
	private String name;

	@Column(name = "POST_CONTENT")
	@NotNull
	private String content;

	@Column(name = "POST_START_DATE")
	@NotNull
	private Timestamp startDate;

	@Column(name = "POST_MODIFIED_DATE")
	private Timestamp modifiedDate;

	@Column(name = "POST_FLAG")
	private int flag;

	@Column(name = "POST_IP_ADDRESS")
	@NotNull
	private String ipAddress;

	@Column(name = "AUTH_USER_ID")
	private long authUserId;

	@Column(name = "THREAD_ID")
	@NotNull
	private long threadId;

	public Post(String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate, int flag,
			@NotNull String ipAddress, long authUserId, @NotNull long threadId) {
		super();
		this.name = name;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.authUserId = authUserId;
		this.threadId = threadId;
	}

	public Post(long id, String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate,
			int flag, @NotNull String ipAddress, long authUserId, @NotNull long threadId) {
		super();
		this.name = name;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.authUserId = authUserId;
		this.threadId = threadId;
	}

	public Post() {
		super();
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public long getAuthUserId() {
		return authUserId;
	}

	public void setAuthUserId(long authUserId) {
		this.authUserId = authUserId;
	}

	public long getThreadId() {
		return threadId;
	}

	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (authUserId ^ (authUserId >>> 32));
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + flag;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + (int) (threadId ^ (threadId >>> 32));
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
		Post other = (Post) obj;
		if (authUserId != other.authUserId)
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (flag != other.flag)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ipAddress == null) {
			if (other.ipAddress != null)
				return false;
		} else if (!ipAddress.equals(other.ipAddress))
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;

		} else if (!name.equals(other.name))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (threadId != other.threadId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Post [postId=" + id + ", name=" + name + ", content=" + content + ", startDate=" + startDate
				+ ", modifiedDate=" + modifiedDate + ", flag=" + flag + ", ipAddress=" + ipAddress + ", userId="
				+ authUserId + ", threadId=" + threadId + "]";
	}
}
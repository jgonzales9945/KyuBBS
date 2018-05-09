package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
=======
import javax.persistence.*;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KB_POSTS")
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="POST_ID")
<<<<<<< HEAD
	private long id;
=======
	private Long id;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
	
	@Column(name="POST_NAME")
	private String name;
	
	@Column(name="POST_CONTENT")
	@NotNull	
	private String content;
	
	@Column(name="POST_START_DATE")
	@NotNull	
	private Timestamp startDate;

	@Column(name="POST_MODIFIED_DATE")
	private Timestamp modifiedDate;
	
	@Column(name="POST_FLAG")
	private int flag;

	@Column(name="POST_IP_ADDRESS")
	@NotNull	
	private String ipAddress;
<<<<<<< HEAD

	@Column(name="AUTH_USER_ID")
	private long authUserId;

	@Column(name="THREAD_ID")
	@NotNull	
	private long threadId;
=======
	
	@ManyToOne(targetEntity = AuthUser.class, fetch=FetchType.EAGER)
    @JoinColumn(name="AUTH_USER_ID", referencedColumnName="AUTH_USER_ID", table="KB_AUTH_USER_LIST")
	private Long authenticatedUserId;
	
	@ManyToOne(targetEntity = BoardThread.class, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="THREAD_ID", referencedColumnName="THREAD_ID", table="KB_THREADS")
	@NotNull	
	private Long threadId;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
	
	public Post() {
		super();
	}

<<<<<<< HEAD
	public Post(long id, String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate,
			int flag, @NotNull String ipAddress, long authUserId, @NotNull long threadId) {
		super();
		this.id = id;
=======
	public Post(Long postId, String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate,
			int flag, @NotNull String ipAddress, Long authenticatedUserId, @NotNull Long threadId) {
		super();
		this.id = postId;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
		this.name = name;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
<<<<<<< HEAD
		this.authUserId = authUserId;
		this.threadId = threadId;
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
=======
		this.authenticatedUserId = authenticatedUserId;
		this.threadId = threadId;
	}

	public Post(String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate, int flag,
			@NotNull String ipAddress, Long authenticatedUserId, @NotNull Long threadId) {
		super();
		this.name = name;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.authenticatedUserId = authenticatedUserId;
		this.threadId = threadId;
	}
	
	public Long getPostId() {
		return id;
	}

	public void setPostId(Long postId) {
		this.id = postId;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
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

<<<<<<< HEAD
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
=======
	public Long getAuthenticatedUserId() {
		return authenticatedUserId;
	}

	public void setAuthenticatedUserId(Long authenticatedUserId) {
		this.authenticatedUserId = authenticatedUserId;
	}

	public Long getThreadId() {
		return threadId;
	}

	public void setThreadId(Long threadId) {
		this.threadId = threadId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + (int) (authenticatedUserId ^ (authenticatedUserId >>> 32));
		result = prime * result + flag;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
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
		if (authenticatedUserId != other.authenticatedUserId)
			return false;
		if (flag != other.flag)
			return false;
		if (id != other.id)
			return false;
		if (threadId != other.threadId)
			return false;
		return true;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Post [id=" + id + ", name=" + name + ", content=" + content + ", startDate=" + startDate
				+ ", modifiedDate=" + modifiedDate + ", flag=" + flag + ", ipAddress=" + ipAddress + ", authUserId="
				+ authUserId + ", threadId=" + threadId + "]";
	}
}
=======
		return "Post [postId=" + id + ", name=" + name + ", content=" + content + ", startDate=" + startDate
				+ ", modifiedDate=" + modifiedDate + ", flag=" + flag + ", ipAddress=" + ipAddress
				+ ", authenticatedUserId=" + authenticatedUserId + ", threadId=" + threadId + "]";
	}
	

}
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93

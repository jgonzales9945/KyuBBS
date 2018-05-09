package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;

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
@Table(name = "KB_POSTS")
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
	@Column(name="POST_ID")
	private Long postId;
	
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
	
	@ManyToOne(targetEntity = AuthUser.class, fetch=FetchType.EAGER)
    @JoinColumn(name="AUTH_USER_ID", referencedColumnName="AUTH_USER_ID")
	private Long userId;
	
	@ManyToOne(targetEntity = BoardThread.class, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="THREAD_ID", referencedColumnName="THREAD_ID")
	@NotNull	
	private Long threadId;

	public Post(Long postId, String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate,
			int flag, @NotNull String ipAddress, Long userId, @NotNull Long threadId) {
		super();
		this.postId = postId;
		this.name = name;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.userId = userId;
		this.threadId = threadId;
	}

	public Post(String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate, int flag,
			@NotNull String ipAddress, Long userId, @NotNull Long threadId) {
=======
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

	public Post() {
		super();
	}

	public Post(String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate, int flag,
			@NotNull String ipAddress, long authUserId, @NotNull long threadId) {
>>>>>>> 4739b1d358a56c5b664eb3f2472072d6e47c0d20
		super();
		this.name = name;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
<<<<<<< HEAD
		this.userId = userId;
		this.threadId = threadId;
	}

	public Post() {
		super();
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
=======
		this.authUserId = authUserId;
		this.threadId = threadId;
	}

	public Post(long id, String name, @NotNull String content, @NotNull Timestamp startDate, Timestamp modifiedDate,
			int flag, @NotNull String ipAddress, long authUserId, @NotNull long threadId) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.authUserId = authUserId;
		this.threadId = threadId;
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
>>>>>>> 4739b1d358a56c5b664eb3f2472072d6e47c0d20
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
<<<<<<< HEAD
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getThreadId() {
		return threadId;
	}

	public void setThreadId(Long threadId) {
		this.threadId = threadId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + flag;
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((postId == null) ? 0 : postId.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((threadId == null) ? 0 : threadId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		if (flag != other.flag)
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
		if (postId == null) {
			if (other.postId != null)
				return false;
		} else if (!postId.equals(other.postId))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (threadId == null) {
			if (other.threadId != null)
				return false;
		} else if (!threadId.equals(other.threadId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
=======
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
>>>>>>> 4739b1d358a56c5b664eb3f2472072d6e47c0d20
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Post [postId=" + postId + ", name=" + name + ", content=" + content + ", startDate=" + startDate
				+ ", modifiedDate=" + modifiedDate + ", flag=" + flag + ", ipAddress=" + ipAddress + ", userId="
				+ userId + ", threadId=" + threadId + "]";
=======
		return "Post [id=" + id + ", name=" + name + ", content=" + content + ", startDate=" + startDate
				+ ", modifiedDate=" + modifiedDate + ", flag=" + flag + ", ipAddress=" + ipAddress + ", authUserId="
				+ authUserId + ", threadId=" + threadId + "]";
>>>>>>> 4739b1d358a56c5b664eb3f2472072d6e47c0d20
	}
}
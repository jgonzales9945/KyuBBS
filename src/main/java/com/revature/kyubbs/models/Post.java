package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

	@ManyToOne(targetEntity = AuthUser.class, fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "AUTH_USER_ID")
	private Long authUserId;

	@ManyToOne(targetEntity = BoardThread.class, fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="THREAD_ID")
	@NotNull
	private Long threadId;

	public Post() {
		super();
	}

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
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", content=" + content + ", startDate=" + startDate
				+ ", modifiedDate=" + modifiedDate + ", flag=" + flag + ", ipAddress=" + ipAddress + ", authUserId="
				+ authUserId + ", threadId=" + threadId + "]";
	}
}
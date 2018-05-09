package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "KB_REPORTS")
public class Report implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "REPORT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "REPORT_IP")
	@NotNull
	private String ip;

	@Column(name = "REPORT_DATE")
	@NotNull
	private Timestamp date;

	@Column(name = "REPORT_COUNT")
	private int count;

	@ManyToOne(targetEntity = BoardThread.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "THREAD_ID", referencedColumnName = "THREAD_ID")
	private Long threadId;

	@ManyToOne(targetEntity = Post.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "POST_ID", referencedColumnName = "POST_ID")
	private Long postId;

	public Report() {
		super();
	}

	public Report(Long id, @NotNull String ip, @NotNull Timestamp date, int count, Long threadId, Long postId) {
		super();
		this.id = id;
		this.ip = ip;
		this.date = date;
		this.count = count;
		this.threadId = threadId;
		this.postId = postId;
	}

	public Report(@NotNull String ip, @NotNull Timestamp date, int count, Long threadId, Long postId) {
		super();
		this.ip = ip;
		this.date = date;
		this.count = count;
		this.threadId = threadId;
		this.postId = postId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Long getThreadId() {
		return threadId;
	}

	public void setThreadId(Long threadId) {
		this.threadId = threadId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", ip=" + ip + ", date=" + date + ", count=" + count + ", threadId=" + threadId
				+ ", postId=" + postId + "]";
	}
}

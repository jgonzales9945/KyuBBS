package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
=======
import javax.persistence.*;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KB_REPORTS")
public class Report implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="REPORT_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long reportId;
	
	@Column(name="REPORT_IP")
	@NotNull
	private String ip;
	
	@Column(name="REPORT_DATE")
	@NotNull
	private Timestamp date;
	
	@Column(name="REPORT_COUNT")
	private int count;

	@OneToMany(targetEntity = BoardThread.class, fetch=FetchType.EAGER)
	@JoinColumn(name="THREAD_ID", referencedColumnName="THREAD_ID", table="KB_THREADS")
	private Long threadId;
	
	@ManyToOne(targetEntity = Post.class, fetch=FetchType.EAGER)
	@JoinColumn(name="POST_ID", referencedColumnName="POST_ID", table="KB_POSTS")
	private Long postId;
	
	public Report() {
		super();
	}
	
	public Report(Long reportId, @NotNull String ip, @NotNull Timestamp date, int count, Long threadId, Long postId) {
		super();
		this.reportId = reportId;
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

	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((postId == null) ? 0 : postId.hashCode());
		result = prime * result + ((reportId == null) ? 0 : reportId.hashCode());
		result = prime * result + ((threadId == null) ? 0 : threadId.hashCode());
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
		Report other = (Report) obj;
		if (count != other.count)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (postId == null) {
			if (other.postId != null)
				return false;
		} else if (!postId.equals(other.postId))
			return false;
		if (reportId == null) {
			if (other.reportId != null)
				return false;
		} else if (!reportId.equals(other.reportId))
			return false;
		if (threadId == null) {
			if (other.threadId != null)
				return false;
		} else if (!threadId.equals(other.threadId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", ip=" + ip + ", date=" + date + ", count=" + count + ", threadId="
				+ threadId + ", postId=" + postId + "]";
<<<<<<< HEAD
	}	
}
=======
	}

}
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93

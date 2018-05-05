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
	
	@Column(name="THREAD_ID")
	private int threadId;
	
	@Column(name="POST_ID")
	private int postId;

	public Report(Long reportId, @NotNull String ip, @NotNull Timestamp date, int count, int threadId, int postId) {
		super();
		this.reportId = reportId;
		this.ip = ip;
		this.date = date;
		this.count = count;
		this.threadId = threadId;
		this.postId = postId;
	}

	public Report() {
		super();
	}

	public Report(@NotNull String ip, @NotNull Timestamp date, int count, int threadId, int postId) {
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

	public int getThreadId() {
		return threadId;
	}

	public void setThreadId(int threadId) {
		this.threadId = threadId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + postId;
		result = prime * result + ((reportId == null) ? 0 : reportId.hashCode());
		result = prime * result + threadId;
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
		if (postId != other.postId)
			return false;
		if (reportId == null) {
			if (other.reportId != null)
				return false;
		} else if (!reportId.equals(other.reportId))
			return false;
		if (threadId != other.threadId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", ip=" + ip + ", date=" + date + ", count=" + count + ", threadId="
				+ threadId + ", postId=" + postId + "]";
	}
	
	
}

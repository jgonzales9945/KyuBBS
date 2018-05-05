package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KB_POSTS")
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="POST_ID")
	private long post_id;
	
	@Column(name="POST_NAME")
	private String Name;
	
	@Column(name="POST_CONTENT")
	@NotNull	
	private String Content;
	
	@Column(name="POST_START_DATE")
	@NotNull	
	private Timestamp Start_Date;

	@Column(name="POST_MODIFIED_DATE")
	private Timestamp Modified_Date;
	
	@Column(name="POST_FLAG")
	private int flag;

	@Column(name="POST_IP_ADDRESS")
	@NotNull	
	private String IPAddress;

	@Column(name="AUTH_USER_ID")
	private long auth_user_id;

	@Column(name="THREAD_ID")
	@NotNull	
	private long thread_id;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public long getPost_id() {
		return post_id;
	}

	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Timestamp getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(Timestamp start_Date) {
		Start_Date = start_Date;
	}

	public Timestamp getModified_Date() {
		return Modified_Date;
	}

	public void setModified_Date(Timestamp modified_Date) {
		Modified_Date = modified_Date;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getIPAddress() {
		return IPAddress;
	}

	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}

	public long getAuth_user_id() {
		return auth_user_id;
	}

	public void setAuth_user_id(long auth_user_id) {
		this.auth_user_id = auth_user_id;
	}

	public long getThread_id() {
		return thread_id;
	}

	public void setThread_id(long thread_id) {
		this.thread_id = thread_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Content == null) ? 0 : Content.hashCode());
		result = prime * result + ((IPAddress == null) ? 0 : IPAddress.hashCode());
		result = prime * result + ((Modified_Date == null) ? 0 : Modified_Date.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Start_Date == null) ? 0 : Start_Date.hashCode());
		result = prime * result + (int) (auth_user_id ^ (auth_user_id >>> 32));
		result = prime * result + flag;
		result = prime * result + (int) (post_id ^ (post_id >>> 32));
		result = prime * result + (int) (thread_id ^ (thread_id >>> 32));
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
		if (Content == null) {
			if (other.Content != null)
				return false;
		} else if (!Content.equals(other.Content))
			return false;
		if (IPAddress == null) {
			if (other.IPAddress != null)
				return false;
		} else if (!IPAddress.equals(other.IPAddress))
			return false;
		if (Modified_Date == null) {
			if (other.Modified_Date != null)
				return false;
		} else if (!Modified_Date.equals(other.Modified_Date))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Start_Date == null) {
			if (other.Start_Date != null)
				return false;
		} else if (!Start_Date.equals(other.Start_Date))
			return false;
		if (auth_user_id != other.auth_user_id)
			return false;
		if (flag != other.flag)
			return false;
		if (post_id != other.post_id)
			return false;
		if (thread_id != other.thread_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", Name=" + Name + ", Content=" + Content + ", Start_Date=" + Start_Date
				+ ", Modified_Date=" + Modified_Date + ", flag=" + flag + ", IPAddress=" + IPAddress + ", auth_user_id="
				+ auth_user_id + ", thread_id=" + thread_id + "]";
	}

}

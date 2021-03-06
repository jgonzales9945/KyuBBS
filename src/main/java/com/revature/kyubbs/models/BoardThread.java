package com.revature.kyubbs.models;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.persistence.*;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Component
@Entity
@Table(name="KB_THREADS")

public class BoardThread implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="THREAD_ID")
	private Long id;
	
	@Column(name="THREAD_TITLE")
	@NotNull
	private String title;
	
	@Column(name="THREAD_NAME")
	private String name;
	
	@Column(name="THREAD_SUBJECT")
	@NotNull
	private String subject;
	
	@Column(name="THREAD_CONTENT")
	@NotNull
	private String content;
	
	@Column(name="THREAD_START_DATE")
	private Timestamp startDate;
	
	@Column(name="THREAD_MODIFIED_DATE")
	private Timestamp modifiedDate;
	
	@Column(name="THREAD_FLAG")
	private int flag;
	
	@Column(name="THREAD_IP_ADDRESS")
	private String ipAddress;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private User userId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="BOARD_ID")
	@NotNull
	private Board boardId;
	
	@JsonIgnore
	@OneToMany(mappedBy="threadId", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Post> posts;

	public BoardThread(Long id, @NotNull String title, String name, @NotNull String subject, @NotNull String content,
			Timestamp startDate, Timestamp modifiedDate, int flag, String ipAddress, User userId,
			@NotNull Board boardId, List<Post> posts) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.subject = subject;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.userId = userId;
		this.boardId = boardId;
		this.posts = posts;
	}

	public BoardThread() {
		super();
	}
	
	
	
	public BoardThread(@NotNull String title, @NotNull String subject, @NotNull String content, String ipAddress,
			@NotNull Board boardId) {
		super();
		this.title = title;
		this.subject = subject;
		this.content = content;
		this.ipAddress = ipAddress;
		this.boardId = boardId;
	}

	public BoardThread(@NotNull String title, @NotNull String subject, @NotNull String content,
			@NotNull Board boardId) {
		super();
		this.title = title;
		this.subject = subject;
		this.content = content;
		this.boardId = boardId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Board getBoardId() {
		return boardId;
	}

	public void setBoardId(Board boardId) {
		this.boardId = boardId;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardId == null) ? 0 : boardId.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + flag;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((posts == null) ? 0 : posts.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		BoardThread other = (BoardThread) obj;
		if (boardId == null) {
			if (other.boardId != null)
				return false;
		} else if (!boardId.equals(other.boardId))
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
		if (posts == null) {
			if (other.posts != null)
				return false;
		} else if (!posts.equals(other.posts))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BoardThread [id=" + id + ", title=" + title + ", name=" + name + ", subject=" + subject + ", content="
				+ content + ", startDate=" + startDate + ", modifiedDate=" + modifiedDate + ", flag=" + flag
				+ ", ipAddress=" + ipAddress + ", userId=" + userId + ", boardId=" + boardId + "]";
	}
	
}

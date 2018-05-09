package com.revature.kyubbs.models;


import java.io.Serializable;
import java.sql.Timestamp;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
=======
import javax.persistence.*;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KB_THREADS")

public class BoardThread implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="THREAD_ID")
	private Long id;
	
	@Column(name="THREAD_TITLE")
	@NotNull
	private String title;
	
	@Column(name="THREAD_NAME")
	@NotNull
	private String name;
	
	@Column(name="THREAD_SUBJECT")
	@NotNull
	private String subject;
	
	@Column(name="THREAD_CONTENT")
	@NotNull
	private String content;
	
	@Column(name="THREAD_START_DATE")
	@NotNull
	private Timestamp startDate;
	
	@Column(name="THREAD_MODIFIED_DATE")
	@NotNull
	private Timestamp modifiedDate;
	
	@Column(name="THREAD_FLAG")
	@NotNull
	private int flag;
	
	@Column(name="THREAD_IP_ADDRESS")
	@NotNull
	private String ipAddress;
	
<<<<<<< HEAD
	@ManyToOne(targetEntity = AuthUser.class)
	@JoinColumn(name="AUTH_USER_ID")
	@NotNull
	private Long authenticatedUserId;
	
	@ManyToOne(targetEntity = Board.class)
	@JoinColumn(name="BOARD_ID")
	@NotNull
	private Long boardId;
=======
	@ManyToOne(targetEntity = AuthUser.class, cascade = CascadeType.DETACH, fetch=FetchType.EAGER)
    @JoinColumn(name="AUTH_USER_ID", referencedColumnName="AUTH_USER_ID", table="KB_AUTH_USER_LIST")
    @NotNull
    private Long authenticatedUserId;
    
    @ManyToOne(targetEntity = Board.class, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="THREAD_ID", referencedColumnName="BOARD_ID", table="KB_BOARDS")
    @NotNull
    private Long boardId;
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
	
	public BoardThread() {
		super();
	}

	public BoardThread(Long id, String title, String name, String subject, String content, Timestamp startDate,
			Timestamp modifiedDate, int flag, String ipAddress, Long authenticatedUserId, Long boardId) {
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
		this.authenticatedUserId = authenticatedUserId;
		this.boardId = boardId;
	}

	public BoardThread(String title, String name, String subject, String content, Timestamp startDate,
			Timestamp modifiedDate, int flag, String ipAddress, Long authenticatedUserId, Long boardId) {
		super();
		this.title = title;
		this.name = name;
		this.subject = subject;
		this.content = content;
		this.startDate = startDate;
		this.modifiedDate = modifiedDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.authenticatedUserId = authenticatedUserId;
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

	public Long getAuthenticatedUserId() {
		return authenticatedUserId;
	}

	public void setAuthenticatedUserId(Long authenticatedUserId) {
		this.authenticatedUserId = authenticatedUserId;
	}

	public Long getBoardId() {
		return boardId;
	}

	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authenticatedUserId == null) ? 0 : authenticatedUserId.hashCode());
		result = prime * result + ((boardId == null) ? 0 : boardId.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + flag;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		if (authenticatedUserId == null) {
			if (other.authenticatedUserId != null)
				return false;
		} else if (!authenticatedUserId.equals(other.authenticatedUserId))
			return false;
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
		return true;
	}

	@Override
	public String toString() {
		return "BoardThread [id=" + id + ", title=" + title + ", name=" + name + ", subject=" + subject + ", content="
				+ content + ", startDate=" + startDate + ", modifiedDate=" + modifiedDate + ", flag=" + flag
				+ ", ipAddress=" + ipAddress + ", authenticatedUserId=" + authenticatedUserId + ", boardId=" + boardId
				+ "]";
	}
}

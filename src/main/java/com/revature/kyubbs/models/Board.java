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
@Table(name = "KB_BOARDS")
public class Board implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BOARD_ID")
	private Long id;
	
	@Column(name="BOARD_NAME")
	@NotNull	
	private String name;
	
	@Column(name="BOARD_DESC")
	@NotNull
	private String desc;
	
	@Column(name="BOARD_START_DATE")
	private Timestamp startDate;
	
	@Column(name="MAX_THREADS")
	private int maxThreads;
	
	@Column(name="MAX_POSTS")
	private int maxPosts;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CATEGORY_ID")
	@NotNull
	private Category categoryId;
	
	@JsonIgnore
	@OneToMany(mappedBy="boardId", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<BoardThread> boardThreads;

	public Board(Long id, @NotNull String name, @NotNull String desc, Timestamp startDate, int maxThreads, int maxPosts,
			@NotNull Category categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.startDate = startDate;
		this.maxThreads = maxThreads;
		this.maxPosts = maxPosts;
		this.categoryId = categoryId;
	}

	public Board() {
		super();
	}

	public Board(@NotNull String name, @NotNull String desc, @NotNull Category categoryId) {
		super();
		this.name = name;
		this.desc = desc;
		this.categoryId = categoryId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public int getMaxThreads() {
		return maxThreads;
	}

	public void setMaxThreads(int maxThreads) {
		this.maxThreads = maxThreads;
	}

	public int getMaxPosts() {
		return maxPosts;
	}

	public void setMaxPosts(int maxPosts) {
		this.maxPosts = maxPosts;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public List<BoardThread> getBoardThreads() {
		return boardThreads;
	}

	public void setBoardThreads(List<BoardThread> boardThreads) {
		this.boardThreads = boardThreads;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardThreads == null) ? 0 : boardThreads.hashCode());
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + maxPosts;
		result = prime * result + maxThreads;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		Board other = (Board) obj;
		if (boardThreads == null) {
			if (other.boardThreads != null)
				return false;
		} else if (!boardThreads.equals(other.boardThreads))
			return false;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (maxPosts != other.maxPosts)
			return false;
		if (maxThreads != other.maxThreads)
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
		return true;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", name=" + name + ", desc=" + desc + ", startDate=" + startDate + ", maxThreads="
				+ maxThreads + ", maxPosts=" + maxPosts + ", categoryId=" + categoryId + ", boardThreads="
				+ boardThreads + "]";
	}
	
}

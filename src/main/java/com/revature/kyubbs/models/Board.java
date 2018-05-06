package com.revature.kyubbs.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

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
	@NotNull
	private Timestamp startDate;
	
	@Column(name="MAX_THREADS")
	@NotNull
	private int maxThreads;
	
	@Column(name="MAX_POSTS")
	@NotNull
	private int maxPosts;
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	@NotNull
	private int categoryId;

	public Board() {
		super();
	}

	public Board(Long id, String name, String desc, Timestamp startDate, int maxThreads, int maxPosts, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.startDate = startDate;
		this.maxThreads = maxThreads;
		this.maxPosts = maxPosts;
		this.categoryId = categoryId;
	}

	public Board(String name, String desc, Timestamp startDate, int maxThreads, int maxPosts, int categoryId) {
		super();
		this.name = name;
		this.desc = desc;
		this.startDate = startDate;
		this.maxThreads = maxThreads;
		this.maxPosts = maxPosts;
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoryId;
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
		if (categoryId != other.categoryId)
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
				+ maxThreads + ", maxPosts=" + maxPosts + ", categoryId=" + categoryId + "]";
	}
}

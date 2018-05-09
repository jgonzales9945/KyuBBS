package com.revature.kyubbs.models;

import java.io.Serializable;

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
@Table(name="KB_CATEGORY")
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long catId;
	
	@Column(name="CATEGORY_NAME")
	@NotNull
	private String name;

	public Category(Long categoryId, @NotNull String name) {
		super();
		this.catId = categoryId;
		this.name = name;
	}

	public Category() {
		super();
	}

	public Category(@NotNull String name) {
		super();
		this.name = name;
	}

	public Long getCategoryId() {
		return catId;
	}

	public void setCategoryId(Long categoryId) {
		this.catId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catId == null) ? 0 : catId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Category other = (Category) obj;
		if (catId == null) {
			if (other.catId != null)
				return false;
		} else if (!catId.equals(other.catId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + catId + ", name=" + name + "]";
	}
}

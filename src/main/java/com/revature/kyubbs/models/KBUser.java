package com.revature.kyubbs.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="KYUBBS_USER")
public class KBUser implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/** 
	 * @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="userSequence")
	 * @SequenceGenerator(allocationSize=1, name="userSequence", sequenceName="SQ_USER_PK")
	 * The sequence generator is not supported by MySql because MySql auto-increments its table values.
	 * As such we have to do the following:
	 * 1 - add to the hibernate.cfg.xml file: <property name="dialet">org.hibernate.dialect.MySQL5Dialect</property>
	 * 2 - add the following instead of @GeneratedValue and @SequenceGenerator: @GeneratedValue(strategy=GenerationType.AUTO)
	**/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private Long user_id;
	
	@Column(name="USERNAME")
	@NotNull
	private String username;
	
	@Column(name="PASSWORD")
	@NotNull
	private String password;
	
	public KBUser() {}

	public KBUser(Long id, String username, String password) {
		super();
		this.user_id = id;
		this.username = username;
		this.password = password;
	}

	public KBUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Long getId() { return user_id; }
	public void setId(Long id) { this.user_id = id; }

	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }

	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		KBUser other = (KBUser) obj;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + user_id + ", username=" + username + ", password=" + password + "]";
	}

	
}

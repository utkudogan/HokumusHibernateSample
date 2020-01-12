package com.hokumus.hib.proje.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "userjava")
public class Users {
	
	
	private Integer id ;
	private String userName;
	private String password;
	private String email;
	private Role userRole;
	
	@SequenceGenerator(name = "seq_users",sequenceName = "seq_users_id",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator ="seq_users",strategy = GenerationType.SEQUENCE )
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "usernameforjava", length = 250,nullable = false)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Enumerated
	@Column(name = "user_role_id")
	public Role getUserRole() {
		return userRole;
	}
	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", userRole=" + userRole + "]";
	}
	

}

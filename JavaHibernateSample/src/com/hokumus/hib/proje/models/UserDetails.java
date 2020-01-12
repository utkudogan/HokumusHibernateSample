package com.hokumus.hib.proje.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetails {
	
	private Integer id;
	private Integer yas;
	private String name;
	private String surname;
	private String tcKNo;
	private Date  birthOfDay;
	private String placeOfBirth;
	private Users users;
	
	@SequenceGenerator(name = "seq_users_details",sequenceName = "seq_users_details_id",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator ="seq_users_details",strategy = GenerationType.SEQUENCE )
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getYas() {
		return yas;
	}
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTcKNo() {
		return tcKNo;
	}
	public void setTcKNo(String tcKNo) {
		this.tcKNo = tcKNo;
	}
	public Date getBirthOfDay() {
		return birthOfDay;
	}
	public void setBirthOfDay(Date birthOfDay) {
		this.birthOfDay = birthOfDay;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
	
	

}

package com.example.RestSample.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentDetails {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String gender;
	
	@Column(name="phonenumber")
	private  long Phonenumber;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		Phonenumber = phonenumber;
	}
	
	
}

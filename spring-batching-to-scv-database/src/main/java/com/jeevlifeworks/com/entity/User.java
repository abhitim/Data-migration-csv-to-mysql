package com.jeevlifeworks.com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Integer id;
    private String firstname;
    private String lastName;
    private String email;
    private String gender;
    private String contactNo;
    
    
	public User(Integer id, String firstname, String lastName, String email, String gender, String contactNo) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.contactNo = contactNo;
	}
	public User() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
    
//    private String dept;
//    private Integer salary;
//    private Date time;
    
}
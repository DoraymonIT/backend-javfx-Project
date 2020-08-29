package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private String userName;
private String password;
private String firstName;
private String lasttName;
private String cne;
private String jobType;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLasttName() {
	return lasttName;
}
public void setLasttName(String lasttName) {
	this.lasttName = lasttName;
}
public String getCne() {
	return cne;
}
public void setCne(String cne) {
	this.cne = cne;
}
public String getJobType() {
	return jobType;
}
public void setJobType(String jobType) {
	this.jobType = jobType;
}
public User(Long id, String userName, String password, String firstName, String lasttName, String cne, String jobType) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
	this.firstName = firstName;
	this.lasttName = lasttName;
	this.cne = cne;
	this.jobType = jobType;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
			+ ", lasttName=" + lasttName + ", cne=" + cne + ", jobType=" + jobType + "]";
}


}

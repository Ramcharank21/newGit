package com.bean.first;

public class BeanClass {
	
	private String ID;
	private String Name;
	private String Email;
	private String Password;
	private String Mobile;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "BeanClass [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + ", Mobile="
				+ Mobile + "]";
	}
	
	
}

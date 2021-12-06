package com.dao.interfac;

public interface SignupInterface {

	public boolean addDetails(String ID,String Name, String Email, String Password, String MobileNumber);
	public boolean existId(String ID);
	//public boolean Signup(String ID);
	public boolean viewDetails(String Name, String Password);
	
}

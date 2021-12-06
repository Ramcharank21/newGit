package com.dbutils.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

	String url="jdbc:mysql://localhost:3306/sree";  
	String driverClass="com.mysql.jdbc.Driver";
	String user="root";
	String pass="vishwa";
	
	Connection con = null;
		
	public Connection getConnection(){
		
		try {
			// database logic here
			// 4 properties are required to connect with any database, 1)username, 2) password, 3) url, 4) driver Class
		
			Class.forName(driverClass);
		    con = DriverManager.getConnection(url,user,pass);
			System.out.println("From Database");
		
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return con;
		
	}

}


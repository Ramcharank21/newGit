package com.dao.interfacimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dao.interfac.SignupInterface;
import com.dbutils.database.DataBase;


public class SignupInterfaceImpl implements SignupInterface{

	@Override
	public boolean addDetails(String ID,String Name, String Email, String Password, String MobileNumber) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO signupreg (ID, Name, Email, Password, MobileNumber) VALUES (?,?,?,?,?)";
		boolean flag = false;
	
		try {
			DataBase Obj = new DataBase(); 
			Connection con = Obj.getConnection();
			System.out.println("Connection Successfully Established "+ con);
		
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1,ID);
			ps.setString(2,Name);
			ps.setString(3,Email);
			ps.setString(4,Password);
			ps.setString(5,MobileNumber);
			
			int i = ps.executeUpdate();
			if (i==1) {
				flag = true;		//true; when data retrieves
				} else {
					flag = false;
					}
			
		} catch (Exception e) { 
			e.printStackTrace();
			// TODO: handle exception
		}
		return flag;
		
	}

	@Override
	public boolean existId(String ID) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connection con = null;
		PreparedStatement ps= null;
		String sql= "select * from signupreg where ID=?";
		ResultSet rs =null;
		DataBase Obj = new DataBase();
		
		try {
			con = Obj.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, ID);
			
			rs=ps.executeQuery();
			if (rs.next()) {
				flag=true;
			} else {
				flag=false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(con != null){
				try{
					con.close();
				} catch(Exception e2){
					e2.printStackTrace();
				}
			}
		}
		
		return flag;
	}

	@Override
	public boolean viewDetails(String Name, String Password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connection con = null;
		PreparedStatement ps= null;
		String sql= "select * from signupreg where Name = ? and Password = ?";
		ResultSet rs =null;
		DataBase Obj = new DataBase(); 
		
		try {
			con = Obj.getConnection();
			System.out.println("connection succesful "+con);
			ps = con.prepareStatement(sql);
			ps.setString(1, Name);
			ps.setString(2, Password);
			
			rs=ps.executeQuery();
			if (rs.next()) {
				flag=true;
			} else {
				flag=false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(con != null){
				try{
					con.close();
				} catch(Exception e2){
					e2.printStackTrace();
				}
			}
		}
		
		return flag;
	}

}

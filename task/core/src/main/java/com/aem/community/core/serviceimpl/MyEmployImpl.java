package com.aem.community.core.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aem.community.core.dbutils.DatabaseConnectionHelper;
import com.aem.community.core.service.MyEmploy;

@Component(service=MyEmploy.class,immediate=true)
public class MyEmployImpl implements MyEmploy {
    private static final Logger log = LoggerFactory.getLogger(MyEmployImpl.class);
@Reference
DatabaseConnectionHelper object;   
    
    
	@Override
	public void addEmployDetails() {
		// TODO Auto-generated method stub
		
		log.info("addEmployDetails started---");
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}finally {
			
		}
		log.info("addEmployDetails end---");

	}

	@Override
	public int employRegi(String name, String password, String email, String country) {
		// TODO Auto-generated method stub
		log.info("employregi started ------");

		String sqlQuery= "insert into emp(name,password,email,country) values (?,?,?,?)";
		int status=0;
		Connection con=null;
		try {
			con=object.getDataBaseConnection("charan");
			log.info("connection established------"+con);
	  PreparedStatement ps=con.prepareStatement(sqlQuery);               
         ps.setString(1,name);  
         ps.setString(2,password);  
         ps.setString(3,email);  
         ps.setString(4,country);  
         status=ps.executeUpdate();  
			log.info("status ------"+status);
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			log.info("employregi method end established------");

		}
		return status;
	}

}

package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllMethods {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet set = null;

	try {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			System.out.println("driver connected");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root", "21091994");
			System.out.println(" connection created successfully");

			String q1 = "create table employ(employname varchar(250),employdesg varchar(250),employadd varchar(250))";
			statement = connection.createStatement();
			statement.executeUpdate(q1);
			System.out.println("table created");
			String q2 = "insert into employ values('abhi','engineer','hyderabad')";
			String q3 = "insert into employ values('mani','supervisor','warangal')";
			String q4 = "insert into employ values('dinesh','dop','vizag')";
			String q5 = "insert into employ values('sushil','bussinessman','karimnagar')";

			statement.executeUpdate(q2);
			statement.executeUpdate(q3);
			statement.executeUpdate(q4);
			statement.executeUpdate(q5);
			System.out.println("values insertd in table successfully");
			String q6 = "select * from employ ORDER BY employname ASC";
			set = statement.executeQuery(q6);
			while (set.next()) {
				System.out.println(" empname " + set.getString(1) + "emp designation " + set.getString(2)
						+ "emp address " + set.getString(3));
			}
			System.out.println("values retrived from table");

			String q7 = "update employ set employname='karthik' where  employname='mani'";
			statement.executeUpdate(q7);
			System.out.println("value updated successfully");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String q8 = "delete from employ where employdesg='dop'";
			statement.executeUpdate(q8);
			System.out.println("value deleted successfully");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			String q9 = "drop table employ";
			statement.executeUpdate(q9);
			System.out.println("table dropped successfully");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {e.printStackTrace();} 
			finally {
			if (connection != null) {
			try {
			connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
			if (statement != null) {
		
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
			if (set != null) {
				
			try {
				set.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}}
}	
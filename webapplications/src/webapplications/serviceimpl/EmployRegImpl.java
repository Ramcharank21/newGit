package webapplications.serviceimpl;

import webapplications.service.EmployRegister;

public class EmployRegImpl implements EmployRegister {

	@Override
	public void employReg(String firstName, String lastName, String email, String password) {
		// TODO Auto-generated method stub
		System.out.println("employRegMethod  "+firstName +" lastname "+lastName+ " email "+email+ " password "+password);
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
		}
		
	}

}

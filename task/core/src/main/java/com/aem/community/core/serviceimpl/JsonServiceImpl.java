package com.aem.community.core.serviceimpl;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aem.community.core.bean.Company;
import com.aem.community.core.service.JsonService;
import com.aem.community.core.servlets.GetJsonDataServlet;
import com.google.gson.Gson;
@Component(service=JsonService.class)
public class JsonServiceImpl implements JsonService{
    private static final Logger log = LoggerFactory.getLogger(JsonServiceImpl.class);
	
	String json;
	@Override
	public String getJsonObject() {
	
		// TODO Auto-generated method stub
		try {
			Company company=new Company();
			company.setCompanyName("Javatpoint");  
			company.setCompanyTagline("The Best Portal to Learn Technologies");  
			company.setEmployees(1000);  
			json=new Gson().toJson(company);  
			log.info("getJsonObject "+json);  
			
			
		} catch (Exception e) {
			// TODO: handle exception
		 e.printStackTrace();
		}
			
		
		return json;
	}

}

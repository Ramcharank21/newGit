/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.aem.community.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aem.community.core.service.JsonService;
import com.aem.community.core.service.MyEmploy;
import com.aem.community.core.service.ReadJsonService;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;


@Component(service=Servlet.class,
           property={
                   Constants.SERVICE_DESCRIPTION + "=GetJsonData Servlet",
                   "sling.servlet.methods=" + HttpConstants.METHOD_GET,
                   "sling.servlet.paths=" + "/bin/getjson",
           })
public class GetJsonDataServlet extends SlingAllMethodsServlet {

    private static final long serialVersionUid = 1L;

    
    private static final Logger log = LoggerFactory.getLogger(GetJsonDataServlet.class);
	
   @Reference
   JsonService jsn;
   
    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
      
  	   String res=jsn.getJsonObject();
  	   log.info("----servlet"+res);
  	   resp.getWriter().write(" Restful servlet  called"+res);
  	   log.info("doget method end-----SaveServlet end");
  			

    }
   @Override
protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	  			
		 
			}
	 	
	}
   
   


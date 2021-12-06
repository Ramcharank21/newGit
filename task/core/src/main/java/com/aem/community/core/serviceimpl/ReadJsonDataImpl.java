package com.aem.community.core.serviceimpl;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aem.community.core.service.ReadJsonService;
import com.aem.community.core.servlets.TextPathServlet;

import static com.aem.community.core.serviceimpl.AppConstants.URL;


@Component(immediate = true, service = ReadJsonService.class)
public class ReadJsonDataImpl implements ReadJsonService {

    private static final Logger log = LoggerFactory.getLogger(ReadJsonDataImpl.class);


	
	@Override
	public String getData() {
		
		String response = Network.readJson(URL);
		log.info("Json   response from jsonplace holder server"+response);
		return response;
	}

}

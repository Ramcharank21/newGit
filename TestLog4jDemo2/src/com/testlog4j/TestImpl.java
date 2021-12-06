package com.testlog4j;

import org.apache.log4j.Logger;

public class TestImpl implements TestInterf{

	static final Logger LOGGER = Logger.getLogger(TestImpl.class); 

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		LOGGER.info("a1 started");
		
		LOGGER.info("a1 end");

	}


}

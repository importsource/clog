package com.importsource.log.sample;
import com.importsource.log.LogManager;
import com.importsource.log.Logger;

public class LogDemo {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(LogDemo.class);
		logger.i("新info");
		logger.e("新error");
		logger.w("新warn");
	
		
	}

}

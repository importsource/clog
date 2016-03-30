package com.importsource.log.sample;
import com.importsource.log.LogManager;
import com.importsource.log.Logger;

public class LogDemo {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(LogDemo.class);
		for(int i=0;i<500;i++){
			logger.i("sdfsdf");
			logger.e("sdfsdf");
			logger.w("水电费水电费水电费水电费");
		}
		
	}

}

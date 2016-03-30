package com.importsource.log;


public class LogManager {

	public static Logger getLogger(Class clazz) {
		Logger logger=new ConsoleLogger(clazz);
		return logger;
	}

}

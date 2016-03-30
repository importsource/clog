package com.importsource.log;


/**
 * 日志管理器
 * @author Hezf
 *
 */
public class LogManager {

	public static Logger getLogger(Class clazz) {
		Logger logger=new ConsoleLogger(clazz);
		return logger;
	}

}

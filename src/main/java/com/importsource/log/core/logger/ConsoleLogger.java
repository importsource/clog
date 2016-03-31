package com.importsource.log.core.logger;

import com.importsource.log.core.AbstractLogger;
import com.importsource.log.core.Logger;

/**
 * 控制台输出
 * @author Hezf
 *
 */
public class ConsoleLogger extends AbstractLogger implements Logger {
	
	public ConsoleLogger(Class clazz) {
		super.clazz=clazz;
	}
	
	@Override
	protected void log(String msg,String level) {
		System.out.println(getFormat(clazz,level)+msg);
	}
}

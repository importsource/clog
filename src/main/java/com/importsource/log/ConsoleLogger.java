package com.importsource.log;

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

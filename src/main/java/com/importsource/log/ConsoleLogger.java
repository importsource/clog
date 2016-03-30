package com.importsource.log;

public class ConsoleLogger extends AbstractLogger implements Logger {
    private Class clazz;
	
	public ConsoleLogger(Class clazz) {
		this.clazz=clazz;
	}
	
	@Override
	public void log(String msg,String level) {
		System.out.println(getFormat(clazz,level)+msg);
		
	}

	public void i(String msg) {
		log(msg, "INFO");
		
	}

	public void e(String msg) {
		log(msg, "ERROR");
		
	}

	public void w(String msg) {
		log(msg, "WARN");
	}

	

}

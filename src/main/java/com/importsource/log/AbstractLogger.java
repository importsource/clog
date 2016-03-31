package com.importsource.log;

import java.util.Date;

import com.importsource.conf.Properties;
import com.importsource.conf.PropertiesTools;

/**
 * 日志实现基类
 * @author Hezf
 *
 */
public abstract class AbstractLogger implements Logger {
	
	private static final String DEFAULT_PACKAGE = "defaultpackage";

	private static final String LEVEL_KEY = "clog.level";

	protected  Properties p=Configuration.newPropertiesInstance();
	
	protected static final String INFO="INFO";
	protected static final String WARN="WARN";
	protected static final String ERROR="ERROR";
	
	
	protected Class clazz;
	/**
	 * 得到格式化输出
	 * @param clazz
	 * @param level
	 * @return
	 */
	protected <T> String getFormat(Class clazz,String level) {
		//[08:58:59:412][INFO] (com.soon.action:35) - 服务器启动
		String pkgName=clazz.getPackage()==null?DEFAULT_PACKAGE:clazz.getPackage().getName();
		String clsName=clazz.getName();
		Date date=new Date();
		StackTraceElement[]  stackTraces=new Throwable().getStackTrace();
		String lineInfo=CurrentLine.getLineInfo(stackTraces[stackTraces.length-1]);
		
		return "["+date+"]["+level+"] ("+pkgName+"."+lineInfo+")";
	}
	
	public void i(String msg) {
		log(msg, INFO);
		
	}
	
	public void w(String msg) {
		log(msg, WARN);
	}

	public void e(String msg) {
		log(msg, ERROR);
		
	}

	
	
	protected String getLevel() {
		String level=PropertiesTools.get(p, LEVEL_KEY, INFO);
		return level.toUpperCase();
	}
	
	protected abstract void log(String msg,String level);

}

package com.importsource.log;

import java.util.Date;

public abstract class AbstractLogger {
	protected <T> String getFormat(Class clazz,String level) {
		//[08:58:59:412][INFO] (com.soon.action:35) - 服务器启动
		String pkgName=clazz.getPackage()==null?"defaultpackage":clazz.getPackage().getName();
		String clsName=clazz.getName();
		Date date=new Date();
		StackTraceElement[]  stackTraces=new Throwable().getStackTrace();
		String lineInfo=CurrentLine.getLineInfo(stackTraces[stackTraces.length-1]);
		
		return "["+date+"]["+level+"] ("+pkgName+"."+lineInfo+")";
	}
	
	public abstract void log(String msg,String level);

}

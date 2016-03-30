/**
 * 
 */
package com.importsource.log;



/**
 * 通过文件输出
 * @author Hezf
 *
 */
public class FileLogger extends AbstractLogger  {

	public FileLogger(Class clazz) {
		super.clazz = clazz;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.importsource.log.AbstractLogger#log(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	protected void log(String msg, String level) {
           String log=getFormat(super.clazz,level)+msg;
           System.out.println(log);
           //输出到指定的文件中
           write(log);
	}

	private void write(String log) {
		FileAppender  f=FileManager.getAppender();
		f.append(log);
		
	}

}

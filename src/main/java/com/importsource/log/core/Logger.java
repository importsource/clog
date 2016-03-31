package com.importsource.log.core;

/**
 * 日志接口
 * @author Hezf
 *
 */
public interface Logger {
	/**
	 * 消息输出
	 * @param msg 输出内容
	 */
	public void i(String msg);
	/**
	 * 错误输出
	 * @param msg 输出内容
	 */
	public void e(String msg);
	/**
	 * 警告输出
	 * @param msg 输出内容
	 */
	public void w(String msg);

}

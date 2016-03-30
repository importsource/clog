package com.importsource.log;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.importsource.conf.Properties;
import com.importsource.conf.PropertiesTools;

/**
 * 日志管理器
 * @author Hezf
 *
 */
public class LogManager {

	public static Logger getLogger(Class clazz) {
		Properties p = com.importsource.conf.Properties.newInstance("conf.xml");
		String loggerStr = PropertiesTools.get(p, "clog.logger", null);
		Logger logger=null;
		Class[] paraTypes = {Class.class};
		Object[] paras = {clazz};
		try {
			Class clas = Class.forName("com.importsource.log."+loggerStr);
			Constructor cons = clas.getConstructor(paraTypes);
			logger = (Logger)cons.newInstance(paras);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return logger;
	}

}

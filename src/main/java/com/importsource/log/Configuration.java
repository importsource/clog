package com.importsource.log;

import com.importsource.conf.Properties;

public class Configuration {
   public static Properties newPropertiesInstance(){
	   Properties p = com.importsource.conf.Properties.newInstance("conf.xml");
	   return p;
   }
}

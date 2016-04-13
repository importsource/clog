# clog
为分布式而生的日志项目，c指cluster

目前正在孜孜不倦的书写当中。。。。

###只需要一行代码：
```java
Logger logger = LogManager.getLogger(LogDemo.class);
logger.i("新info");
```

###还需要配置文件(文件名为：ilog.xml)：
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- 如果是文件，那么要指定文件目录。文件实现提供者。文件名生成规则。每个文件大小 -->
<configuration>
    <!--日志输出实现提供者-->
	<property>
		<name>clog.logger</name>
		<value>ConsoleLogger</value>
	</property>
	<!--日志级别 i w e-->
	<property>
		<name>clog.level</name>
		<value>info</value>
	</property>
	<!-- 文件的目录 -->
	<property>
		<name>clog.dir</name>
		<value>/log/</value>
	</property>
	<!-- 文件的前缀 -->
	<property>
		<name>clog.file.pre</name>
		<value>test</value>
	</property>

</configuration>
```
###  输出结果：

```log
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][ERROR] (com.importsource.log.sample.LogDemo.java: Line 11)sdfsdf
[Wed Mar 30 22:58:13 CST 2016][WARN] (com.importsource.log.sample.LogDemo.java: Line 12)水电费水电费水电费水电费
[Wed Mar 30 22:58:13 CST 2016][INFO] (com.importsource.log.sample.LogDemo.java: Line 10)sdfsdf
```


###maven依赖：
```xml
<dependency>
		<groupId>com.importsource.log4jc</groupId>
		<artifactId>importsource-log4jc</artifactId>
		<version>0.0.1-SNAPSHOT</version>
</dependency>
```


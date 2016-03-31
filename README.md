# clog
为分布式而生的日志项目，c指cluster

目前正在孜孜不倦的书写当中。。。。

###只需要一行代码：
```java
Logger logger = LogManager.getLogger(LogDemo.class);
logger.i("新info");
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


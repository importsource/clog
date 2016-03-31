package com.importsource.log.file;

/**
 * 负责文件输出的各种事情
 * @author Hezf
 *
 */
public class FileManager {

	public static FileAppender getAppender() {
		return new FileAppender();
	}

	
    
}

package com.importsource.log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements Appendable {

	public void append(String value) {
		// 首先看指定目录有没有文件。如果没有就新建，并写入。如果有的话，找到那个最新的文件，然后看是否超出限制。如果没有超出就追加。如果超出了新建文件。
		File f = findFile();
		try {
			FileWriter fileWriter=new FileWriter(f, true);
		    BufferedWriter writer = new BufferedWriter(fileWriter);
			if (f.canWrite()) {
				writer.newLine();
				writer.append(value);
				
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private File findFile() {
		// 先去指定目录，
		String path = "Y:/clog/log/";
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
			
		}f = new File(path + "20160330.log");

		// File f=new
		// File("C:"+File.pathSeparator+"clog"+File.pathSeparator+"log"+File.pathSeparator+"20160330.log");
		return f;
	}

}

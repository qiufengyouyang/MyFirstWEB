package com.zn.unit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

//文件操作工具类
public class FileUtil {

	// 创建目录

	public static File createDir(String dirPath) {
		File dir;
		try {
			dir = new File(dirPath);
			if (!dir.exists()) {
				FileUtils.forceMkdir(dir);
			}
		} catch (IOException e) {
			throw new RuntimeException("创建目录出错！");
		}
		return dir;
	}
	//创建文件
	public static File createFile(String filePath){
		File file;
		try {
			file = new File(filePath);
			File parentDir = file.getParentFile();
			if(!parentDir.exists()){
				FileUtils.forceMkdir(parentDir);
			}
		} catch (IOException e) {
			
			throw new RuntimeException("创建文件出错");
		}
		return file;
	
	}
	//复制目录（不会复制空目录）
	public static void copyDir(String srcPath,String dirPath){
		
		try {
			File srcDir = new File(dirPath);
			File descDir = new File(dirPath);
			if(srcDir.exists() && descDir.exists()){
				FileUtils.copyDirectoryToDirectory(srcDir, descDir);
			}
		} catch (IOException e) {
			 throw new RuntimeException("目录复制出错!");
		}
		
	}
	
	
}

package com.zn.unit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

//流操作
public class StreamUtil {
	
	//从输入流中读取数据
	public static String getString(InputStream in){
		StringBuilder builder = new StringBuilder();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line;
			while((line = reader.readLine())!=null){
				builder.append(line);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return builder.toString();
	}
	//将输入流 复制到输出流
	public static void copyStream(InputStream in,OutputStream out){
		
		try {
			int length;
			byte[]buffer = new byte[4*1024];
			while((length = in.read(buffer,0,buffer.length))!=-1){
				out.write(buffer, 0, length);
			}
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 throw new RuntimeException(e);
		}finally{
			
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

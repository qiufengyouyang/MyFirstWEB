package com.zn.unit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.smart4j.framework.util.ArrayUtil;
import org.smart4j.framework.util.CodecUtil;
import org.smart4j.framework.util.StringUtil;

public class WebUtil {

	// 将数据以JSON格式写入响应
	public static void writeJson(HttpServletResponse response, Object data) throws IOException {

		// 设置响应头
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		// 写数据
		PrintWriter writer = response.getWriter();
		writer.write(JsonUtil.toJSON(data));
		writer.flush();
		writer.close();
	}

	// 将数据 以html格式的形式写入响应
	public static void writehTML(HttpServletResponse response, Object data) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		// 写数据
		PrintWriter writer = response.getWriter();
		writer.write(JsonUtil.toJSON(data));
		writer.flush();
		writer.close();
	}

	// 获取请求中的参数
	public static Map<String, Object> getRequestMap(HttpServletRequest request) {
		Map<String, Object> paramMap = new LinkedHashMap<String, Object>();

		try {
			String method = request.getMethod();
			if ("put".equalsIgnoreCase(method) || "delete".equalsIgnoreCase(method)) {
				String queryString = CodecUtil.decodeURL(StreamUtil.getString(request.getInputStream()));
				if (StringUtil.isNotEmpty(queryString)) {
					String[] qsArray = StringUtil.splitString(queryString, "&");
					if (ArrayUtil.isNotEmpty(qsArray)) {
						for (String qs : qsArray) {
							String[] array = StringUtil.splitString(qs, "=");
							if (ArrayUtil.isNotEmpty(array) && array.length == 2) {
								String paramName = array[0];
								String paramVal = array[1];
								if (checkParamName(paramName)) {
									if (paramMap.containsKey(paramName)) {
										paramVal = paramMap.get(paramName) + "," + paramVal;
									}
									paramMap.put(paramName, paramVal);
								}
							}
						}
					}
				}
			} else {
				Enumeration<String> paramNames = request.getParameterNames();
				while (paramNames.hasMoreElements()) {
					String paramName = paramNames.nextElement();
					if (checkParamName(paramName)) {
						String[] paramValues = request.getParameterValues(paramName);
						if (ArrayUtil.isNotEmpty(paramValues)) {
							if (paramValues.length == 1) {
								paramMap.put(paramName, paramValues[0]);
							} else {
								StringBuilder builder = new StringBuilder("");
								for (int i = 0; i < paramValues.length; i++) {
									builder.append(paramValues[i]);
									if (i != paramValues.length - 1) {
										builder.append(",");
									}

								}
								paramMap.put(paramName, builder.toString());
							}
						}
					}

				}

			}
		} catch (IOException e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return paramMap;
	}

	// 检查 参数
	private static boolean checkParamName(String paramName) {
		return !paramName.equals("_"); // 忽略 jQuery 缓存参数
	}
	//请求转发
	public static void fordRequest(HttpServletRequest request,HttpServletResponse response,String path){
		
		try {
			request.getRequestDispatcher(path).forward(request, response);
		} catch (ServletException | IOException e) {
			 throw new RuntimeException(e);
		}
	}
	//请求重定向
	public static void sendDirect(String path,HttpServletRequest request,HttpServletResponse response){
		try {
			response.sendRedirect(request.getContextPath() + path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
}

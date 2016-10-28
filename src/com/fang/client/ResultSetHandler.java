package com.fang.client;

import java.sql.ResultSet;

/**
 * @author zhangning
 * 2016年7月29日
 * 结果集处理器接口
 */
public interface ResultSetHandler {
	/**
	 * @param rs  查询结果集
	 * @return
	 */
	public Object handler(ResultSet rs);
}

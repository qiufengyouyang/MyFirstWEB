package com.fang.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.fang.entity.Classes;
import com.fang.entity.Orders;
import com.fang.unit.MyBitesUtil;

public class TestOrders {
	@Test
	public void test(){
		System.out.println("".equals(null));
	}
	
	@Test
	public void testGetAll(){
		String statement = "com.fang.client.OrdersMapper.selectByPrimaryKey";
		SqlSession session = MyBitesUtil.getSqlSession();
		Orders orders = session.selectOne(statement,1);
		session.close();
		System.out.println(orders);
	}
	
	@Test
	public void testClasses(){
		SqlSession session = MyBitesUtil.getSqlSession();
		String statement = "com.fang.client.ClassesMapper.getClass";
		Classes c = session.selectOne(statement,1);
		session.close();
		System.out.println(c);
	}
	

}

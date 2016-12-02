package com.fang.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fang.entity.Customer;
import com.fang.unit.MyBitesUtil;
import com.fang.unit.MybatisUtil;

public class TestCURDByXml {
	// org.apache.log4j.ConsoleAppender
	private static final Logger logger = LoggerFactory.getLogger(TestCURDByXml.class);

	@Test
	public void testAdd() {
		SqlSession session = MyBitesUtil.getSqlSession(true);
		String statement = "com.fang.mapping.customerMapper.addCustomer";
		Customer customer = new Customer();
		customer.setName("张三");
		customer.setSex(1);
		customer.setDegree(12.343);
		int result = session.insert(statement, customer);
		// 手动提交事务然后关闭
		session.commit();
		session.close();
		System.out.println(result);
	}

	@Test
	public void testGetAll() {
		SqlSession session = MyBitesUtil.getSqlSession();
		String statement = "com.fang.client.customerMapper.getAllCustomer";
		List<Customer> customers = session.selectList(statement);
		System.out.println(customers);
		System.out.println("再次查询...");
		List<Customer> customers2 = session.selectList(statement);
		session.close();
		System.out.println(customers2);
	}

	@Test
	public void testDelete() {
		SqlSession session = MyBitesUtil.getSqlSession(true);
		String statement = "com.fang.mapping.customerMapper.deleteCustomer";
		logger.debug("test");
		// int result = session.delete(statement, 1);
		session.commit();
		session.close();

	}

	@Test
	public void testCache() {
		SqlSession session = MybatisUtil.getSqlSession();
		SqlSession session2 = MybatisUtil.getSqlSession();
		String statement = "com.fang.client.customerMapper.getCustomer";
		Customer customers = session.selectOne(statement, 6);
		String statement2 = "com.fang.client.customerMapper.getCustomer";
		System.out.println("第二次出现呢开始了..... ");
		
		Customer customers2 = session2.selectOne(statement2, 6);
		
		System.out.println("查询结束");
		
	}

}

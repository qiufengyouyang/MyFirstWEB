package com.fang.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.fang.entity.Customer;
import com.fang.unit.MyBitesUtil;

public class TestCURDByXml {

	@Test
	public void testAdd() {
		SqlSession session = MyBitesUtil.getSqlSession(true);
		String statement = "com.fang.mapping.customerMapper.addCustomer";
		Customer customer = new Customer();
		customer.setName("张三");
		customer.setSex(1);
		customer.setDegree(12.343);
		int result = session.insert(statement, customer);
		//手动提交事务然后关闭
		session.commit();
		session.close();
		System.out.println(result);
	}
	@Test
	public void testGetAll(){
		SqlSession session = MyBitesUtil.getSqlSession();
		String statement = "com.fang.mapping.customerMapper.getAllCustomer";
		List<Customer> customers = session.selectList(statement);
		session.close();
		System.out.println(customers);
	}
	@Test
	public void testDelete(){
		SqlSession session = MyBitesUtil.getSqlSession(true);
		String statement = "com.fang.mapping.customerMapper.deleteCustomer";
		int result = session.delete(statement, 1);
		session.commit();
		session.close();
		System.out.println(result);
	}

}

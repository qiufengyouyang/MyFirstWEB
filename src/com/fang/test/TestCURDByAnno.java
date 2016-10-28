package com.fang.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.fang.entity.Customer;
import com.fang.mapping.CustomerMapperI;
import com.fang.unit.MyBitesUtil;

public class TestCURDByAnno {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testAdd(){
		SqlSession session = MyBitesUtil.getSqlSession(true);
		//CustomerMapperI接口的实现类有sesion.getMapper()动态构建
		CustomerMapperI mapper = session.getMapper(CustomerMapperI.class);
		Customer c = new Customer();
		c.setName("zxf");
		c.setSex(1);
		c.setDegree(12.2);
		int result= mapper.add(c);
		session.commit();
		session.close();
		System.out.println(result);
	}
	@Test
	public void testGetAll(){
		SqlSession session = MyBitesUtil.getSqlSession();
		//CustomerMapperI接口的实现类有sesion.getMapper()动态构建
		CustomerMapperI mapper = session.getMapper(CustomerMapperI.class);
		List<Customer> list = mapper.getAll();
		session.close();
		System.out.println(list);
	}

}

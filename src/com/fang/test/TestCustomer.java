package com.fang.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fang.entity.Customer;

/**
 * 测试myboites
 * 
 * @author zhangning 2016年7月26日
 */
public class TestCustomer {

	public static void main(String[] args) {
		// mybatis配置文件
		String resource = "conf.xml";
		// 使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
		InputStream in = TestCustomer.class.getClassLoader().getResourceAsStream(resource);
		// 构建sqlsession工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 创建能执行映射文件中sql的sqlSession
		SqlSession session = sessionFactory.openSession();
		
		/**
		 * 映射sql的标识字符串，
		 * com.fang.mapping.customerMapper是customerMapper.xml文件中
		 * mapper标签的namespace属性的值，
		 * getCustomer是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
		 */
		String statement = "com.fang.mapping.customerMapper.getCustomer";// 映射sql的标识字符串
		//执行查询返回一个唯一的customer对象的sql
		Customer customer = session.selectOne(statement, 1);
		
		session.close();
		System.out.println(customer);

	}

}

package com.fang.unit;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author zhangning 2016年7月27日
 */
public class MyBitesUtil {

	/**
	 * @return 获取sqlSessionFactory
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		String resource = "conf.xml";
		InputStream in = MyBitesUtil.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		return factory;
	}

	/**
	 * @return 获取sqlSession
	 */
	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession();
	}

	/**
	 * 获取SqlSession
	 * 
	 * @param isAutoCommit
	 *            true 表示创建的SqlSession对象在执行完SQL之后会自动提交事务 false
	 *            表示创建的SqlSession对象在执行完SQL之后不会自动提交事务，
	 *            这时就需要我们手动调用sqlSession.
	 *            commit()提交事务
	 * @return SqlSession
	 */
	public static SqlSession getSqlSession(boolean isAutoCommit) {
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}

package com.fang.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.fang.entity.Customer;

/**
 * dingyisql映射的接口，采用注解知名方法要执行的sql
 * @author zhangning
 * 2016年7月27日
 */
public interface CustomerMapperI {
	@Insert("insert into customer(name,sex,degree) values(#{name},#{sex},#{degree})")
	public int add(Customer customer);
	@Delete("delete from customer where id = #{id}")
	public int deleteById(int id);
	@Select("select * from customer where id = #{id}")
	public Customer getById(int id);
	@Select("select * from customer")
	public List<Customer> getAll();
}

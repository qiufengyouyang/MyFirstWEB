package com.fang.redis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Transaction;

public class RedisJava {

	public static void main(String[] args) {
		//链接本地服务
		Jedis jedis = new Jedis("localhost");
		jedis.auth("1234");
		 //查看服务是否运行
		 //设置 redis 字符串数据
	    jedis.set("testKey", "hello");
	    System.out.println("测试key：" + jedis.get("testKey"));
	  //存储数据到列表中
	    jedis.lpush("testList", "redis");
	    jedis.lpush("testList", "mongodb");
	    jedis.lpush("testList", "mysqlredis");
	    List<String> list = jedis.lrange("testList", 0, 10);
	    System.out.println(list);
	    jedis.del("testKey");
	    System.out.println("测试key：" + jedis.get("testKey"));
	    // 获取数据并输出
	  
	     
	    /* Iterator<String> it= keys.iterator();
	     while(it.hasNext()){
	    	 String key=it.next();
	    	 System.out.println(jedis.get(key));
	     }*/
	}
	
	@Test
	public void testSimple(){
		Jedis jedis = new Jedis("localhost");
		jedis.auth("1234");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			jedis.set("n" + i,"n" +i);
		}
		long end = System.currentTimeMillis();
		System.out.println("simple:set " + (end - start)/1000 + "seconds");
		jedis.disconnect();
	}
	// redis的事务很简单，他主要目的是保障，一个client发起的事务中的命令可以连续的执行，而中间不会插入其他client的命令。
	@Test
	public void testTransaction(){
		Jedis jedis = new Jedis("localhost");
		jedis.auth("1234");
		long start = System.currentTimeMillis();
		Transaction tx = jedis.multi();
	
		for (int i = 0; i < 100000; i++) {
			tx.set("t" + i,"t" +i);
		}
		List<Object> results = tx.exec();
		long end = System.currentTimeMillis();
		System.out.println("transaction set: " + (end - start)/1000 + "seconds");
		jedis.disconnect();
	}
	//我们需要采用异步方式，一次发送多个指令，不同步等待其返回结果。这样可以取得非常好的执行效率。这就是管道，调用方法如下：
	@Test
	public void test3Pipelined() {
	    Jedis jedis = new Jedis("localhost");
	    jedis.auth("1234");
	    Pipeline pipeline = jedis.pipelined();
	    long start = System.currentTimeMillis();
	    for (int i = 0; i < 100000; i++) {
	        pipeline.set("p" + i, "p" + i);
	    }
	    List<Object> results = pipeline.syncAndReturnAll();
	    long end = System.currentTimeMillis();
	    System.out.println("Pipelined SET: " + ((end - start)/1000.0) + " seconds");
	    jedis.disconnect();
	}
	//管道中添加 事务  现其效率和单独使用事务差不多，甚至还略微差
	@Test
	public void test4combPipelineTrans() {
		Jedis jedis = new Jedis("localhost"); 
	    long start = System.currentTimeMillis();
	    Pipeline pipeline = jedis.pipelined();
	    pipeline.multi();
	    for (int i = 0; i < 100000; i++) {
	        pipeline.set("" + i, "" + i);
	    }
	    pipeline.exec();
	    List<Object> results = pipeline.syncAndReturnAll();
	    long end = System.currentTimeMillis();
	    System.out.println("Pipelined transaction: " + ((end - start)/1000.0) + " seconds");
	    jedis.disconnect();
	}

}

package com.fang.designer.factory;

import org.junit.Test;

public class TestFactory {
	
	@Test
	public void testSimpleFactory(){
		SimpleFactory factory = new SimpleFactory();
		Sender sender = null;
		sender = factory.getSender("mail");
		sender.sende();
		sender= factory.getSender("h");
		sender.sende();
		
	}
	@Test
	public void testFctory(){
		SenderFactory factory = new MailFactory();
		Sender sender = factory.procuce();
		sender.sende();
	}
}

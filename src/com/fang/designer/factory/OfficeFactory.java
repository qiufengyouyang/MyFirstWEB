package com.fang.designer.factory;

/**
 * @author zhangning
 * 2016年7月29日
 */
public class OfficeFactory implements SenderFactory {

	@Override
	public Sender procuce() {
		
		return new OfficeSender();
	}

}

package com.fang.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.time.DateUtils;

import com.fang.payment.EncryptMethod.PaymentEncryptTool;

public class Hello {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("username", "znhfg");
		map.put("password", "sdsd");
		map.put("sign_type", "MD5");
		String sign = PaymentEncryptTool.GetSignResult(new TreeMap<String,String>(map),"27e1be4fdcaa83d7f61c489994ff6ed6","UTF-8");
		System.out.println(sign);
		

	}

}

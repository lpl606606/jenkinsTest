package com.icbc.ndf.service.impl;

import org.springframework.stereotype.Service;

import com.icbc.ndf.service.ServiceB;

@Service
public class ServiceBImpl implements ServiceB{
    
	private final String SYMBOL_FOR_B = "_B";
	
	@Override
	public String b(String param) {
		String bString = "";
		if(-1 != param.indexOf("B")){
			bString = SYMBOL_FOR_B;
		}
		return bString;
	}

}

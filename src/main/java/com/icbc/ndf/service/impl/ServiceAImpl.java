package com.icbc.ndf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbc.ndf.service.ServiceA;
import com.icbc.ndf.service.ServiceB;
import com.icbc.ndf.service.ServiceC;

@Service
public class ServiceAImpl implements ServiceA{

	private final String SYMBOL_FOR_A = "_A"; 
	
	@Autowired
    private ServiceB serviceB;
	
	@Autowired
    private ServiceC serviceC;
	
	@Override
	public String a(String param) {
		String aString = "";
		if(-1 != param.indexOf("A")){
			aString = SYMBOL_FOR_A;
		}
		String bString = serviceB.b(param);
		String cString = serviceC.c(param);
		return aString + bString + cString;
		
	}
	
}

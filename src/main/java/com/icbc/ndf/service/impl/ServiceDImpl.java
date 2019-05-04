package com.icbc.ndf.service.impl;

import org.springframework.stereotype.Service;

import com.icbc.ndf.service.ServiceD;

@Service
public class ServiceDImpl implements ServiceD{

	private final String SYMBOL_FOR_D = "_D";
	
	@Override
	public String d(String param) {
		String dString = "";
		if(-1 != param.indexOf("D")){
			dString = SYMBOL_FOR_D;
		}
		return dString;
	}

}

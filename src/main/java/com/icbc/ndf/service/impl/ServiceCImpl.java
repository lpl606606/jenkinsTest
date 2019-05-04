package com.icbc.ndf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbc.ndf.service.ServiceC;
import com.icbc.ndf.service.ServiceD;

@Service
public class ServiceCImpl implements ServiceC{

	private final String SYMBOL_FOR_C = "_C";
	
	@Autowired
    private ServiceD serviceD;
	
	@Override
	public String c(String param) {
		String cString = "";
		if(-1 != param.indexOf("C")){
			cString = SYMBOL_FOR_C;
		}
		String dString = serviceD.d(param);
		return cString + dString;
	}

}

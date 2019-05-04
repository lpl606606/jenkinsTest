package com.icbc.ndf.service.impl;

import org.springframework.stereotype.Service;

import com.icbc.ndf.service.TestVoid;

@Service
public class TestVoidImpl implements TestVoid{

	@Override
	public String argsVoid() {
		return "argsVoid";
	}

	@Override
	public void returnVoid(String str) {
		System.out.println(str);
	}

}

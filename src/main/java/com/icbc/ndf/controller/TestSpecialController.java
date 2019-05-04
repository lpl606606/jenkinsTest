package com.icbc.ndf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icbc.ndf.service.TestVoid;
import com.icbc.ndf.utils.TestUtil;

@RestController
public class TestSpecialController {
	
	@Autowired
	private TestVoid testVoid;
	
	/**
	 * 测试静态方法
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/api/testStatic", method = RequestMethod.GET)
    public String testStatic(@RequestParam(value = "str", required = true) String str) {
        return TestUtil.echo(str);
    }
	
	/**
	 * 测试void
	 * @param 
	 * @return
	 */
	@RequestMapping(value = "/api/testVoid", method = RequestMethod.GET)
    public String testVoid(@RequestParam(value = "str", required = true) String str) {
		testVoid.returnVoid(str);
        return testVoid.argsVoid();
    }
	
	/**
	 * 测试mock
	 */
	
	/**
	 * 测试exception
	 */
	
	/**
	 * 测试自定义bean
	 */
	@RequestMapping(value = "/api/testBean", method = RequestMethod.GET)
    public String testBean(@RequestParam(value = "name", required = true) String name) {
        return "success";
    }
}

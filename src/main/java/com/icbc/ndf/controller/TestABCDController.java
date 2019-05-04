package com.icbc.ndf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icbc.ndf.service.ServiceA;

@RestController
public class TestABCDController {
	@Autowired
    private ServiceA serviceA;

    @RequestMapping(value = "/api/testABCD", method = RequestMethod.GET)
    public String testABCD(@RequestParam(value = "parttern", required = true) String parttern) {
        return serviceA.a(parttern);
    }
}

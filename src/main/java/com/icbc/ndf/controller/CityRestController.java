package com.icbc.ndf.controller;

import com.icbc.ndf.domain.City;
import com.icbc.ndf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }
    
    @RequestMapping(value = "/api/echoCity", method = RequestMethod.GET)
    public City echoCity(@RequestParam(value = "cityName", required = true) String cityName) {
    	City c = new City();
    	c.setCityName(cityName);
    	c.setDescription("echo city");
        return cityService.echoCity(c);
    }
}

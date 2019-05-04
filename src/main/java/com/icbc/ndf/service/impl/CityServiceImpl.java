package com.icbc.ndf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbc.ndf.dao.CityDao;
import com.icbc.ndf.domain.City;
import com.icbc.ndf.service.CityService;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

	@Override
	public City echoCity(City c) {
		return c;
	}

}

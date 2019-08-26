package com.qf.car.service.impl;

import com.qf.car.domain.entity.Car;
import com.qf.car.mapper.CarMapper;
import com.qf.car.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("carCarServiceImpl")
public class CarServiceImpl implements CarService {
    @Resource
    CarMapper carMapper ;
    @Override
    public List<Car> findAll() {
        return carMapper.findAll();
    }

    @Override
    public List<Car> search(int page, int size) {
        page = (page-1)*10;
        return carMapper.search(page,size);
    }

}

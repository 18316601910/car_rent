package com.qf.car.service.impl;

import com.qf.car.domain.entity.CarCart;
import com.qf.car.mapper.CarCartMapper;
import com.qf.car.service.CarCartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("carCartService")
public class CarCartServiceImpl implements CarCartService {
    @Resource
    CarCartMapper carCartMapper;
    @Override
    public List<CarCart> findById(int uid) {
        return carCartMapper.findById(uid);
    }

//    @Override
//    public int updateNumById(int cartId, int op) {
//        return carCartMapper.updateNumById(cartId,op);
//    }

//    @Override
//    public CarCart findCartByUidCartId(int uid, int cartId) {
//        return carCartMapper.findCartByUidCartId(uid, cartId);
//    }
}

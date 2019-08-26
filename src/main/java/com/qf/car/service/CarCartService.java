package com.qf.car.service;

import com.qf.car.domain.entity.CarCart;

import java.util.List;

public interface CarCartService {
    List<CarCart> findById(int uid);
//    int updateNumById(int cartId,int op);
//    CarCart findCartByUidCartId(int uid ,int cartId);
}

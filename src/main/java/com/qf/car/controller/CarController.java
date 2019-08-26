package com.qf.car.controller;

import com.qf.car.domain.entity.CarCart;
import com.qf.car.mapper.CarCartMapper;
import com.qf.car.service.CarCartService;
import com.qf.car.service.CarService;
import com.qf.car.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/car")
@Slf4j
public class CarController {
    @Resource
    CarService carService ;
    @Resource
    CarCartService carCartService;

    @GetMapping("/findAll")
    public Result findcar(){
        try {
            return Result.success(carService.findAll());
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 点击购物车
     * @param uid
     * @return
     */
    @GetMapping("/findcarcart")
    public Result findcarcart(int uid){
        try {
            return Result.success(carCartService.findById(uid));
        } catch (Exception e) {
            return Result.error();
        }
    }
    /**
     * 更新数量
     */
//    public Result updateNum(int cartId,int op){
//        try {
//            return Result.success(carCartService.updateNumById(cartId,op));
//        } catch (Exception e) {
//            return Result.error();
//        }
//    }
    /**
     * 是否存在订单
     */
//    public Result findCartByUidCartId(int uid ,int cartId){
//        try {
//            return Result.success(carCartService.findCartByUidCartId(uid,cartId));
//        } catch (Exception e) {
//            return Result.error();
//        }
//    }

}

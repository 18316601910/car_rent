package com.qf.car.mapper;

import com.qf.car.domain.entity.Car;
import com.qf.car.domain.entity.CarCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarCartMapper {
    /**
     * 点击购物车
     * @param uid
     * @return
     */
    List<CarCart> findById(@Param("uid") int uid);

    /**
     * op 1表示增加  2表示减少
     * @param cartId
     * @return
     */
//    int updateNumById(@Param("cartId") int cartId,@Param("op") int op);

    /**
     * UID  cartid 查询是否存在该购物车记录
     * @param uid
     * @param cartId
     * @return
     */
//    CarCart findCartByUidCartId(@Param("uid") int uid,@Param("cartId" )int cartId);

}
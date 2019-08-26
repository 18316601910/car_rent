package com.qf.car.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Car {
    private Integer cid;

    /**
    * 车名
    */
    private String carName;

    private String carBrand;

    private Integer carNumber;

    private String carPhoto;

    /**
    * 租一天的单价
    */
    private BigDecimal carPrice;

    /**
    * 0表示还未租，1表示已租
    */
    private Integer carStatus;

    /**
    * 车牌号
    */
    private String carPlate;

    /**
    * 车的简介
    */
    private String carDetails;
}
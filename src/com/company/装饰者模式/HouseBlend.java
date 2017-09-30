package com.company.装饰者模式;

/**
 * Created by 23832 on 2017/7/28.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}

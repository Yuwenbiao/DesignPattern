package com.company.装饰者模式;

/**
 * 浓缩咖啡类
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

package com.company.简单工厂;

/**
 * Created by 23832 on 2017/7/30.
 */
public class Pizza {

    void prepare() {
        System.out.println("Prepare...");
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}

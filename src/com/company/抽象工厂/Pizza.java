package com.company.抽象工厂;

import com.company.工厂模式.Dough;
import com.company.工厂模式.Sauce;

/**
 * 披萨类
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;


    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

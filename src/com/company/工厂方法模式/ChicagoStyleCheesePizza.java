package com.company.工厂方法模式;

import com.company.工厂方法模式.Pizza;

/**
 * 芝加哥风味披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name="Chicago Style Sauce and Cheese Pizza";
        dough="Extra Crust Dough";
        sauce="Plum Sauce";

        toppings.add("Shredded Cheese");//覆盖mozzarella意大利白干酪
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square");
    }
}

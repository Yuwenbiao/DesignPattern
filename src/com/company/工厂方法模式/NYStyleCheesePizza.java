package com.company.工厂方法模式;

import com.company.工厂方法模式.Pizza;

/**
 * 纽约风味披萨
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name="NY Style Sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");//上面覆盖的是意大利reggiano高级干酪
    }
}

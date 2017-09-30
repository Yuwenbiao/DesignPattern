package com.company;

import com.company.工厂方法模式.ChicagoPizzaStore;
import com.company.工厂方法模式.NYPizzaStore;
import com.company.工厂方法模式.Pizza;
import com.company.工厂方法模式.PizzaStore;

public class Main {

    public static void main(String[] args) {
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//        Beverage beverage1 = new HouseBlend();
//        beverage1 = new Mocha(beverage1);
//        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}

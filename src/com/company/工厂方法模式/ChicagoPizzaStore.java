package com.company.工厂方法模式;

import com.company.工厂方法模式.ChicagoStyleCheesePizza;
import com.company.工厂方法模式.Pizza;
import com.company.工厂方法模式.PizzaStore;

/**
 * 芝加哥风味店
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}

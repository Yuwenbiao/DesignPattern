package com.company.抽象工厂;

import com.company.工厂模式.Dough;
import com.company.工厂模式.Sauce;

/**
 * 配料接口
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}

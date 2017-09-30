package com.company.抽象工厂;

import com.company.工厂模式.Dough;
import com.company.工厂模式.MarinaraSauce;
import com.company.工厂模式.Sauce;
import com.company.工厂模式.ThinCrustDough;

/**
 * Created by 23832 on 2017/7/30.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}

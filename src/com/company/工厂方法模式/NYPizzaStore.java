package com.company.工厂方法模式;

/**
 * 纽约风味披萨店
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
//        Pizza pizza = null;
//        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
//
//        if (type.equals("cheese")) {
//            pizza = new CheesePizza(ingredientFactory);
//        }
//        return pizza;
    }
}

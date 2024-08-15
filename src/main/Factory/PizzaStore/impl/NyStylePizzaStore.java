package main.Factory.PizzaStore.impl;

import main.Factory.PizzaIngredients.PizzaIngredients;
import main.Factory.PizzaIngredients.impl.NYPizzaIngredients;
import main.Pizza.Pizza;
import main.Pizza.impl.NYStyleCheesePizza;
import main.Factory.PizzaStore.PizzaStore;

public class NyStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredients pizzaIngredients = new NYPizzaIngredients();
        if(type.equalsIgnoreCase("cheese")){
            return new NYStyleCheesePizza(pizzaIngredients);
        }
        else{
            return null;
        }
    }
}

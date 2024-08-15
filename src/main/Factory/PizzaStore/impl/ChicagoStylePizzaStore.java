package main.Factory.PizzaStore.impl;

import main.Factory.PizzaIngredients.PizzaIngredients;
import main.Factory.PizzaIngredients.impl.ChicagoPizzaIngredients;
import main.Factory.PizzaStore.PizzaStore;
import main.Pizza.Pizza;
import main.Pizza.impl.ChicagoStyleCheesePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredients pizzaIngredients = new ChicagoPizzaIngredients();
        if(type.equalsIgnoreCase("cheese")){
            return new ChicagoStyleCheesePizza(pizzaIngredients);
        }
        else{
            return null;
        }
    }
}

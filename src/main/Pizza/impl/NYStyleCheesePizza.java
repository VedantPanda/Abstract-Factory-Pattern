package main.Pizza.impl;

import main.Factory.PizzaIngredients.PizzaIngredients;
import main.Factory.PizzaIngredients.impl.NYPizzaIngredients;
import main.Pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    PizzaIngredients pizzaIngredients;

    public NYStyleCheesePizza(PizzaIngredients pizzaIngredients){
        this.pizzaIngredients = pizzaIngredients;
        name = "New York Style Cheese Pizza";
    }

    @Override
    public void prepare() {
        dough = pizzaIngredients.createDough();
        sauce = pizzaIngredients.createSauce();
        System.out.println("Preparing "+name);
    }
}

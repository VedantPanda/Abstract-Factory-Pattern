package main.Pizza.impl;

import main.Factory.PizzaIngredients.PizzaIngredients;
import main.Pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    PizzaIngredients pizzaIngredients;
    public ChicagoStyleCheesePizza(PizzaIngredients pizzaIngredients){
        this.pizzaIngredients = pizzaIngredients;
        name = "Chicago Style Cheese Pizza";
    }

    @Override
    public void prepare() {
        dough = pizzaIngredients.createDough();
        sauce = pizzaIngredients.createSauce();
        System.out.println("Preparing "+name);
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

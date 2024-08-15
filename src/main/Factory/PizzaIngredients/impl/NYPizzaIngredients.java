package main.Factory.PizzaIngredients.impl;

import main.Factory.PizzaIngredients.PizzaIngredients;
import main.Ingredients.Dough.Dough;
import main.Ingredients.Dough.impl.ThickCrustTough;
import main.Ingredients.Sauce.Sauce;
import main.Ingredients.Sauce.impl.MarinaraSauce;

public class NYPizzaIngredients implements PizzaIngredients {
    @Override
    public Dough createDough() {
        return new ThickCrustTough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}

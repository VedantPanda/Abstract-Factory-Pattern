package main.Factory.PizzaIngredients.impl;

import main.Factory.PizzaIngredients.PizzaIngredients;
import main.Ingredients.Dough.Dough;
import main.Ingredients.Dough.impl.ThinCrustDough;
import main.Ingredients.Sauce.Sauce;
import main.Ingredients.Sauce.impl.PlumTomatoSauce;

public class ChicagoPizzaIngredients implements PizzaIngredients {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}

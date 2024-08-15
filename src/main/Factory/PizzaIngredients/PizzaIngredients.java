package main.Factory.PizzaIngredients;

import main.Ingredients.Dough.Dough;
import main.Ingredients.Sauce.Sauce;

public interface PizzaIngredients {
    public Dough createDough();
    public Sauce createSauce();
}

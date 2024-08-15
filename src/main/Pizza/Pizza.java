package main.Pizza;

import main.Ingredients.Dough.Dough;
import main.Ingredients.Sauce.Sauce;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal pieces");
    }

    public void box(){
        System.out.println("Place pizza in official store box");
    }

}

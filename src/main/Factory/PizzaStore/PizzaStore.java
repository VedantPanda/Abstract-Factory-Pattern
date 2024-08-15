package main.Factory.PizzaStore;

import main.Pizza.Pizza;

public abstract class PizzaStore {

    Pizza pizza;

    public void orderPizza(String type){
        pizza = createPizza(type);
        if(pizza==null){
            return;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String type);

}

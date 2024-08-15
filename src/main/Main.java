package main;

import main.Factory.PizzaStore.PizzaStore;
import main.Factory.PizzaStore.impl.ChicagoStylePizzaStore;
import main.Factory.PizzaStore.impl.NyStylePizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyStylePizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}

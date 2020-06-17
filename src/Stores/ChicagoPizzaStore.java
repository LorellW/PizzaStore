package Stores;

import Pizza.Chicago.*;
import Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "veggie":{
                break;
            }
            case "cheese":{
                return new ChicagoStyleCheesePizza();
            }
            case "pepperoni":{
                break;
            }
            case "clam":{
                break;
            }
        }
        return pizza;
    }
}

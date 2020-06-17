package Stores;

import Pizza.*;
import Pizza.NY.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "veggie":{
                break;
            }
            case "cheese":{
                return new NYStyleCheesePizza();
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

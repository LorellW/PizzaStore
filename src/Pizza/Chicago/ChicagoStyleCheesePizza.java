package Pizza.Chicago;

import Pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Stile Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plume Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

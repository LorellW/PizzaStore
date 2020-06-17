package IngredientFactory;

import Ingredients.Cheese.Cheese;
import Ingredients.Clam.Clam;
import Ingredients.Dough.Dough;
import Ingredients.Pepperoni.Pepperoni;
import Ingredients.Sauce.Sauce;
import Ingredients.Veggies.Veggies;

public interface PizzaIngrFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}

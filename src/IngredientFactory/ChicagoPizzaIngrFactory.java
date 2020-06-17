package IngredientFactory;
import Ingredients.Cheese.*;
import Ingredients.Clam.*;
import Ingredients.Dough.*;
import Ingredients.Pepperoni.*;
import Ingredients.Sauce.*;
import Ingredients.Veggies.*;


public class ChicagoPizzaIngrFactory implements PizzaIngrFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Spinach(), new BlackOlives(),new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }
}

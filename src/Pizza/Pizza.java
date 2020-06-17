package Pizza;
import Ingredients.Cheese.*;
import Ingredients.Clam.*;
import Ingredients.Dough.*;
import Ingredients.Pepperoni.*;
import Ingredients.Sauce.*;
import Ingredients.Veggies.*;
import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}

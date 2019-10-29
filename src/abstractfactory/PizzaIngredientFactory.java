package abstractfactory;

import abstractfactory.ingredients.Cheese;
import abstractfactory.ingredients.Dough;
import abstractfactory.ingredients.Sauce;
import abstractfactory.ingredients.Veggies;

/**
 * @author sibhasin
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
}

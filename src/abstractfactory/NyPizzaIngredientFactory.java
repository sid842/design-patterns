package abstractfactory;

import abstractfactory.ingredients.Cheese;
import abstractfactory.ingredients.Dough;
import abstractfactory.ingredients.Garlic;
import abstractfactory.ingredients.MarinaraSauce;
import abstractfactory.ingredients.Onion;
import abstractfactory.ingredients.ReggianoCheese;
import abstractfactory.ingredients.Sauce;
import abstractfactory.ingredients.ThinCrustDough;
import abstractfactory.ingredients.Veggies;

/**
 * @author sibhasin
 */
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion()};
        return veggies;
    }
}

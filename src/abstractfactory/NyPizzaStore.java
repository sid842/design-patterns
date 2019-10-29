package abstractfactory;


import abstractfactory.pizza.CheesePizza;
import abstractfactory.pizza.Pizza;

/**
 * @author sibhasin
 */
public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();
        if(type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY style cheese piiza");
        }
        return pizza;
    }
}

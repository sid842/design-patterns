package abstractfactory;

import abstractfactory.pizza.Pizza;

/**
 * @author sibhasin
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("Steps for preparing pizza!!");
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}

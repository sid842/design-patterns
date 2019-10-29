package abstractfactory;

import abstractfactory.pizza.Pizza;

/**
 * @author sibhasin
 */
public class PizzaAbstractFactoryTestDrive {
    public static void run() {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        pizza.prepare();
        System.out.println("Abstract factory piiza: " + pizza);
    }
}

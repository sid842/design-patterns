package factorymethod;

/**
 * @author sibhasin
 */
public class PizzaTestDrive {

    public static void run() {
        PizzaStore nyStore = new NyPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("First pizza: " + pizza.getName() + "\n");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Second pizza: " + pizza.getName() + "\n");

    }
}

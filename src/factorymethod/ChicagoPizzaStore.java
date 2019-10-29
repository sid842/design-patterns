package factorymethod;

/**
 * @author sibhasin
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }
        //We can add more pizza's using same logic
        return null;
    }
}

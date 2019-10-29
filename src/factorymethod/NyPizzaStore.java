package factorymethod;

/**
 * @author sibhasin
 */
public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)) {
            return new NyStyleCheesePizza();
        }
        //We can add more pizza's using same logic
        return null;
    }
}

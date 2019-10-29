package factorymethod;

/**
 * @author sibhasin
 */
public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        name = "NY style cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";
        toppings.add("Grated reggiano cheese");
    }

}

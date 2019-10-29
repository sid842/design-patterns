package factorymethod;

/**
 * @author sibhasin
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
        toppings.add("Shredded mozzarella cheese");
    }

    void cut() {
        System.out.println("Cutting pizza into 4 slices");
    }
}

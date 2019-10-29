package factorymethod;

import java.util.ArrayList;

/**
 * @author sibhasin
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing the dough...");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings:");
        for(String topping: toppings)
            System.out.println(" " + topping);
    }

    void bake() {
        System.out.println("Bake for 25 mins");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    void box() {
        System.out.println("Place pizza in box.");
    }

    public String getName() {
        return name;
    }
}

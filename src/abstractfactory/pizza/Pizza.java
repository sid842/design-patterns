package abstractfactory.pizza;

import abstractfactory.ingredients.Cheese;
import abstractfactory.ingredients.Dough;
import abstractfactory.ingredients.Sauce;
import abstractfactory.ingredients.Veggies;

import java.util.Arrays;

/**
 * @author sibhasin
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;
    Veggies[] veggies;
    Sauce sauce;

    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough.toString() +
                ", cheese=" + cheese.toString() +
                ", veggies=" + Arrays.toString(veggies) +
                ", sauce=" + sauce +
                '}';
    }
}

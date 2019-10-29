package strategy;

/**
 * @author sibhasin
 */
public class ModelDuck extends Duck {
    public ModelDuck(FlyBehaviour flyBehaviour, QuackBehavior quackBehavior) {
        super(flyBehaviour, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a model duck, i can be anything anytime...");
    }
}

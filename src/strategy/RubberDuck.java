package strategy;

/**
 * @author sibhasin
 */
public class RubberDuck extends Duck {

    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehavior quackBehavior) {
        super(flyBehaviour, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck!!");
    }
}

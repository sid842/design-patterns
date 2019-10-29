package strategy;

/**
 * @author sibhasin
 */
public class MallardDuck extends Duck {

    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehavior quackBehavior) {
        super(flyBehaviour, quackBehavior);
    }

    public void display() {
        System.out.println("I am a mallard duck!!");
    }
}

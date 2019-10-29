package strategy;

/**
 * @author sibhasin
 *
 *
 */
public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public Duck(FlyBehaviour flyBehaviour, QuackBehavior quackBehavior) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

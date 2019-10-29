package strategy;


/**
 * @author sibhasin
 */
public class StrategyPatternDriver {

    public static void run() {
        FlyWithWings flyWithWings = new FlyWithWings();
        Quack quack = new Quack();
        NoFly noFly = new NoFly();
        Squeak squeak = new Squeak();

        MallardDuck mallardDuck = new MallardDuck(flyWithWings, quack);
        test(mallardDuck);

        RubberDuck rubberDuck = new RubberDuck(noFly, squeak);
        test(rubberDuck);

        ModelDuck modelDuck = new ModelDuck(flyWithWings, squeak);
        test(modelDuck);

        modelDuck.setFlyBehaviour(noFly);
        modelDuck.setQuackBehavior(quack);
        test(modelDuck);

    }

    public static void test(Duck duck) {
        System.out.println("-----");
        duck.display();
        duck.performFly();
        duck.performQuack();
        System.out.println("-----");
    }
}

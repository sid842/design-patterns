import abstractfactory.PizzaAbstractFactoryTestDrive;
import factorymethod.PizzaTestDrive;
import observer.WeatherStation;
import singleton.Singleton;
import singleton.SingletonDriver;
import strategy.StrategyPatternDriver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //System.out.println("<----------------------->");
        //StrategyPatternDriver.run();

        //System.out.println("<----------------------->");
        //WeatherStation.run();

        //System.out.println("<----------------------->");
        //SingletonDriver.run();

        //System.out.println("<----------------------->");
        //PizzaTestDrive.run();

        System.out.println("<----------------------->");
        PizzaAbstractFactoryTestDrive.run();
    }
}

package singleton;

/**
 * @author sibhasin
 */
public class SingletonDriver {
    public static void run() {
        Singleton i1 = Singleton.getInstance();
        Singleton i2 = Singleton.getInstance();

        if(i1 == i2) {
            System.out.println("This means there is only one instance of the class. Double checking ensures thread safety.");
        }
    }
}

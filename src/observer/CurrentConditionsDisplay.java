package observer;


/**
 * @author sibhasin
 */
public class CurrentConditionsDisplay implements Observer {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("Current temperature is = " + temp + " and current humidity is = " + humidity);
    }
}

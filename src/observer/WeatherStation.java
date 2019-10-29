package observer;

/**
 * @author sibhasin
 *
 * This is used to describe the observer pattern.
 * It uses a push model where data is pushed to the subscriber or observer.
 * There is a way to get around that by provided the getters but that way we have to expose the subject class a bit.
 */
public class WeatherStation {

    public static void run() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 35.2f);
        weatherData.setMeasurements(90, 45, 45.1f);
        weatherData.setMeasurements(70, 55, 25.3f);
    }
}

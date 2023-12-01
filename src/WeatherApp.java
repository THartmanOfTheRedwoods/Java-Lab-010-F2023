import java.io.IOException;

/**
 * @author Olivia McKittrick
 * @date 12/1/2023
 */
public class WeatherApp {
    public static void main(String[] args) throws IOException {
        // Create a WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Create display objects and register them with the WeatherStation
        Display currentConditions = new CurrentConditions(weatherStation);
        Display statisticsDisplay = new StatisticsDisplay(weatherStation);
        Display forecastDisplay = new ForecastDisplay(weatherStation);

        // Simulate measurements
        weatherStation.measure();
    }
}

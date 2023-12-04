/**
 * @author Trevor Hartman
 * @author MJ Fracess
 *
 * @since Version 1.0
 */

public class CurrentConditions implements Display {
    private WeatherStation weatherStation;
    private float temperature;
    private float humidity;

    public CurrentConditions(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerDisplay(this);
    }

    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: Temperature " + temperature + "°C, Humidity " + humidity + "%");
    }
}

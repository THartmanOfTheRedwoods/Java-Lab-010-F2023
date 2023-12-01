/**
 * @Author Olivia McKittrick
 * @date 12/1/2023
 */
public class CurrentConditions implements Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private final WeatherStation weatherStation;

    public CurrentConditions(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
    }

    public void update() {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.pressure = weatherStation.getPressure();
        display();
    }

    public void display() {
        System.out.println("Current Conditions: Temperature=" + temperature + "F, Humidity=" + humidity + "%, Pressure=" + pressure + "hPa");
    }
}



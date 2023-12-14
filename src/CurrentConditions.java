/*
*
* @author Trevor Hartman
* @author Angelina Perez
*
* @version 1.0
*
 */
public class CurrentConditions implements Display{
    private WeatherStation weatherStation;
    private float temperature;
    private float humidity;
    private float pressure;
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

    @Override
    public void display() {
        System.out.printf("Current conditions:%nTemperature: %.2f °C%nHumidity: %.2f%%%nPressure: %.2f hPa%n",
                temperature, humidity, pressure);
    }
}

/**
 * @author Trevor Hartman
 * @author MJ Fracess
 *
 * @since Version 1.0
 */
public class StatisticsDisplay implements Display {
    private WeatherStation weatherStation;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerDisplay(this);
    }

    @Override
    public void update() {
        float temperature = weatherStation.getTemperature();
        if (temperature < temperatureMin || temperatureMin == 0) {
            temperatureMin = temperature;
        }
        if (temperature > temperatureMax) {
            temperatureMax = temperature;
        }
        temperatureTotal += temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics: Min Temperature " + temperatureMin + "°C, Max Temperature "
                + temperatureMax + "°C, Average Temperature " + (temperatureTotal / weatherStation.measure()) + "°C");
    }
}

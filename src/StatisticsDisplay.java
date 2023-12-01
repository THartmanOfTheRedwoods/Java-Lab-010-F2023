/**
 * @author Olivia McKittrick
 * @date 12/1/2023
 */
public class StatisticsDisplay implements Display {
    private float temperatureMin;
    private float temperatureMax;
    private float tempRunningTotal;
    private int numReadings;
    private final WeatherStation weatherStation;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
    }

    public void update() {
        float temperature = weatherStation.getTemperature();
        if (numReadings == 0 || temperature < temperatureMin) {
            temperatureMin = temperature;
        }
        if (numReadings == 0 || temperature > temperatureMax) {
            temperatureMax = temperature;
        }
        tempRunningTotal += temperature;
        numReadings++;
        display();
    }

    public void display() {
        float averageTemperature = (numReadings == 0) ? 0 : tempRunningTotal / numReadings;
        System.out.println("Statistics: Min Temperature=" + temperatureMin + "F, Max Temperature=" + temperatureMax +
                "F, Average Temperature=" + averageTemperature + "F");
    }
}
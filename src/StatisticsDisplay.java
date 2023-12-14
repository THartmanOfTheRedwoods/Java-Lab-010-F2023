/*
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 *
 * @version 1.0
 *
 */
public class StatisticsDisplay implements Display {
    private WeatherStation weatherStation;
    private float temperatureMin;
    private float temperatureMax;
    private float tempRunningTotal;
    private int numReadings;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);

    }
    public void update() {
        float temperature = weatherStation.getTemperature();
        temperatureMin = Math.min(temperatureMin, temperature);
        temperatureMax = Math.max(temperatureMax, temperature);
        tempRunningTotal += temperature;
        numReadings++;
        display();
    }

    @Override
    public void display() {
        float averageTemperature = tempRunningTotal / numReadings;
        System.out.print("Statistics: Min=");
        System.out.printf("%.2f", temperatureMin);
        System.out.print(", Max=");
        System.out.printf("%.2f", temperatureMax);
        System.out.print(", Average=");
        System.out.printf("%.2f%n", averageTemperature);

    }
}

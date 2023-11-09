public class StatisticsDisplay implements Display {
    private double temperatureMin;
    private double temperatureMax;
    private double tempRunningTotal;
    private int numReadings;
    private WeatherStation weatherStation;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
        temperatureMin = Double.MAX_VALUE;
        temperatureMax = Double.MIN_VALUE;
        tempRunningTotal = 0;
        numReadings = 0;
    }

    public void update() {
        double temperature = weatherStation.getTemperature();
        temperatureMin = Math.min(temperatureMin, temperature);
        temperatureMax = Math.max(temperatureMax, temperature);
        tempRunningTotal += temperature;
        numReadings++;
        display();
    }

    public void display() {
        System.out.println("Temperature statistics:");
        System.out.println("Min: " + temperatureMin + " °C");
        System.out.println("Max: " + temperatureMax + " °C");
        System.out.println("Average: " + (tempRunningTotal / numReadings) + " °C");
    }
}

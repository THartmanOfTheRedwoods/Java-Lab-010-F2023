public class StatisticsDisplay implements Display {
    private float temperatureMin = Float.MAX_VALUE;
    private float temperatureMax = Float.MIN_VALUE;
    private float tempRunningTotal = 0;
    private int numReadings = 0;

    private WeatherStation weatherStation;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
    }

    @Override
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
        System.out.println("Statistics: Min Temperature = " + temperatureMin +
                "°C, Max Temperature = " + temperatureMax +
                "°C, Average Temperature = " + averageTemperature + "°C");
    }
}

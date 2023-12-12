public class StatisticsDisplay implements Display {
    private double temperatureMin = Double.MAX_VALUE;
    private double temperatureMax = Double.MIN_VALUE;
    private double tempRunningTotal = 0;
    private int numReadings = 0;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temperatureMin = Math.min(temperatureMin, temperature);
        temperatureMax = Math.max(temperatureMax, temperature);
        tempRunningTotal += temperature;
        numReadings++;
        display();
    }

    @Override
    public void display() {
        double averageTemperature = numReadings > 0 ? tempRunningTotal / numReadings : 0;
        System.out.printf("Temperature Min/Max/Avg: Min: %.2f, Max: %.2f, Avg: %.2f%n", temperatureMin, temperatureMax, averageTemperature);
    }

    @Override
    public void update() {

    }
}

public class CurrentConditions implements Display {
    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: Temperature: %.2f, Humidity: %.2f%%, Pressure: %.2f%n", temperature, humidity, pressure);
    }

    @Override
    public void update() {

    }
}

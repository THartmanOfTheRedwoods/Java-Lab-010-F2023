public class CurrentConditions implements Display {
    private double temperature;
    private double humidity;
    private double pressure;
    private WeatherStation weatherStation;

    public CurrentConditions(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
    }

    public void update() {
        temperature = weatherStation.getTemperature();
        humidity = weatherStation.getHumidity();
        pressure = weatherStation.getPressure();
        display();
    }

    public void display() {
        System.out.println("Current conditions:");
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + " %");
        System.out.println("Pressure: " + pressure + " hPa");
    }
}
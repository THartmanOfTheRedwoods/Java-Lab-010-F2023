public class CurrentConditions implements Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherStation weatherStation;

    public CurrentConditions(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
        humidity = weatherStation.getHumidity();
        pressure = weatherStation.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: Temperature = " + temperature +
                "°C, Humidity = " + humidity +
                "%, Pressure = " + pressure + " inHg");
    }
}

public class CurrentConditions implements Display {
    private float temperature;
    private float humidity;

    private float pressure;

    WeatherStation ws = new WeatherStation();

    public CurrentConditions(WeatherStation weatherStation) {
        this.ws = ws;
        weatherStation.registerDisplay(this);
    }

    @Override
    public void update() {
        this.humidity = ws.getHumidity();
        this.pressure = ws.getPressure();
        this.temperature = ws.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current Conditions:%nTemperature: %f%nHumidity: %f%nPressure: %f%n",temperature,humidity,pressure);
    }
}
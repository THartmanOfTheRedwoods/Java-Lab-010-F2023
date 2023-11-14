public class CurrentConditions {
    private final WeatherStation ws;
    private float temperature;
    private float humidity;

    private float pressure;


    public CurrentConditions(WeatherStation ws) {
        this.ws = ws;
        ws.registerDisplay((Display) this);

    }
    public void update() {
        this.temperature = ws.getTemperature();
        this.humidity = ws.getHumidity();
        this.pressure = ws.getPressure();
        display();
    }
    public void display() {
        System.out.println("Current Conditions:");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + " hPa");
    }
}

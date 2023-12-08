class CurrentCondition implements Display {
    private WeatherStation ws;
    private float temperature;
    private float humidity;

    private float pressure;

    public CurrentCondition(WeatherStation ws) {
        this.ws = ws;
        ws.registerDisplay(this);
    }

    public void update() {
        // Update temperature and humidity based on WeatherStation data
        this.temperature = ws.getTemperature();
        this.humidity = ws.getHumidity();
        this.pressure = ws.getPressure();
        display();
    }

    public void display() {
        // Display current conditions
        System.out.println("Current Conditions: Temperature = " + temperature + "F, Humidity = " + humidity + "%");
    }
}

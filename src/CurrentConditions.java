class CurrentConditions implements Display {
    private WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditions(WeatherStation ws) {
        this.ws = ws;
        this.ws.registerDisplay(this);
    }

    public void update() {
        this.temperature = ws.getTemperature();
        this.humidity = ws.getHumidity();
        this.pressure = ws.getPressure();
        display();
    }

    public void display() {
        System.out.println("Current Conditions: Temperature " + temperature +
                "°C, Humidity " + humidity + "%, Pressure " + pressure + " hPa");
    }
}
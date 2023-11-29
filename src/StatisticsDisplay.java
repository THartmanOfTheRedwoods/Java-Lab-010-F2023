class StatisticsDisplay implements Display {
    private WeatherStation ws;
    private int numReadings;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;

    public StatisticsDisplay(WeatherStation ws) {
        this.ws = ws;
        this.ws.registerDisplay(this);
    }

    public void update() {

        float currentTemperature = ws.getTemperature();
        numReadings++;

        temperatureTotal += currentTemperature;

        if (currentTemperature < temperatureMin || temperatureMin == 0) {
            temperatureMin = currentTemperature;
        }

        if (currentTemperature > temperatureMax) {
            temperatureMax = currentTemperature;
        }

        display();
    }

    public void display() {
        System.out.println("Statistics: Min Temperature " + temperatureMin +
                "°C, Max Temperature " + temperatureMax + "°C, Average Temperature " +
                (temperatureTotal / numReadings) + "°C");
    }
}

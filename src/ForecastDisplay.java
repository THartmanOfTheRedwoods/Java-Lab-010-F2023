class ForecastDisplay implements Display {
    private WeatherStation weatherStation;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerDisplay(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherStation.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: Current Pressure " + currentPressure + ", Last Pressure " + lastPressure);
    }
}

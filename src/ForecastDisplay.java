class ForecastDisplay implements Display {
    private WeatherStation ws;
    private float lastPressure;
    private float currentPressure;

    public ForecastDisplay(WeatherStation ws) {
        this.ws = ws;
        ws.registerDisplay(this);
    }

    public void update() {
        // Update forecast based on WeatherStation data
        // Assuming the lastPressure is available in WeatherStation
        this.lastPressure = ws.getPressure();
        currentPressure = ws.getPressure();
        display();
    }

    public void display() {
        // Display forecast
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}

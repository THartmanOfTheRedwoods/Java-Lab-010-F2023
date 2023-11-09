public class ForecastDisplay implements Display {
    private double lastPressure;
    private double currentPressure;
    private WeatherStation weatherStation;

    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
        lastPressure = weatherStation.getPressure();
        currentPressure = lastPressure;
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherStation.getPressure();
        display();
    }

    public void display() {
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

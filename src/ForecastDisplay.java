/**
 * @author Olivia McKittrick
 * @date 12/1/2023
 */
public class ForecastDisplay implements Display {
    private float lastPressure;
    private float currentPressure;
    private final WeatherStation weatherStation;

    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);
    }

    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherStation.getPressure();
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
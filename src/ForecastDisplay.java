/*
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 *
 * @version 1.0
 *
 */
public class ForecastDisplay implements Display {
    private WeatherStation weatherStation;
    private float currentPressure;
    private float lastPressure;


    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerDisplay(this);

    }
    public void update() {
       lastPressure = currentPressure;
       currentPressure = weatherStation.getPressure();
       display();
    }
    public void display() {
        System.out.println("Forecast: ");
        if(currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}

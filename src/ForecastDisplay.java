public class ForecastDisplay implements Display {
    private double lastPressure = Double.NaN; // Initialized to NaN for the first update
    private double currentPressure = Double.NaN;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        if (Double.isNaN(lastPressure) || Double.isNaN(currentPressure)) {
            System.out.println("Forecast data unavailable");
            return;
        }

        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update() {

    }
}

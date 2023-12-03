public class ForecastDisplay {
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
            System.out.print("Forecast: ");
            if (currentPressure > lastPressure) {
                System.out.println("Improving weather expected!");
            } else if (currentPressure == lastPressure) {
                System.out.println("More of the same");
            } else {
                System.out.println("Watch out for cooler, rainy weather");
            }
        }
    }
}

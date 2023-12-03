public class CurrentConditions {
    class CurrentConditions implements Display {
        private WeatherStation weatherStation;
        private float temperature;
        private float humidity;

        public CurrentConditions(WeatherStation weatherStation) {
            this.weatherStation = weatherStation;
            this.weatherStation.registerDisplay(this);
        }

        @Override
        public void update() {
            temperature = weatherStation.getTemperature();
            humidity = weatherStation.getHumidity();
            pressure = weatherStation.getPressure();
            display();
        }

        @Override
        public void display() {
            System.out.println("Current Conditions: Temperature " + temperature + "°C, Humidity " + humidity + "%");
        }
    }
}

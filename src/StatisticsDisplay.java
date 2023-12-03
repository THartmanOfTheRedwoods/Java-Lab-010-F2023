public class StatisticsDisplay {
    class StatisticsDisplay implements Display {
        private WeatherStation weatherStation;
        private float temperatureMin;
        private float temperatureMax;
        private float temperatureTotal;
        private int numReadings;

        public StatisticsDisplay(WeatherStation weatherStation) {
            this.weatherStation = weatherStation;
            this.weatherStation.registerDisplay(this);
        }

        @Override
        public void update() {
            float temperature = weatherStation.getTemperature();
            temperatureTotal += temperature;
            numReadings++;

            if (numReadings == 1 || temperature < temperatureMin) {
                temperatureMin = temperature;
            }

            if (numReadings == 1 || temperature > temperatureMax) {
                temperatureMax = temperature;
            }

            display();
        }

        @Override
        public void display() {
            System.out.println("Statistics: Min Temperature " + temperatureMin +
                    "°C, Max Temperature " + temperatureMax + "°C, Average Temperature " +
                    (temperatureTotal / numReadings) + "°C");
        }
    }

}

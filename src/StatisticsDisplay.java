class StatisticsDisplay implements Display {
        private WeatherStation ws;
        private float temperatureMin;
        private float temperatureMax;
        private float temperatureTotal;
        private int numReadings;

        public StatisticsDisplay(WeatherStation ws) {
            this.ws = ws;
            ws.registerDisplay(this);
        }

        public void update() {
            // Update statistics based on WeatherStation data
            float currentTemperature = ws.getTemperature();
            temperatureTotal += currentTemperature;
            numReadings++;

            if (numReadings == 1 || currentTemperature < temperatureMin) {
                temperatureMin = currentTemperature;
            }

            if (numReadings == 1 || currentTemperature > temperatureMax) {
                temperatureMax = currentTemperature;
            }

            display();
        }

        public void display() {
            // Display statistics
            System.out.println("Temperature Statistics: Min = " + temperatureMin + "F, Max = " + temperatureMax + "F, Avg = "
                    + (temperatureTotal / numReadings) + "F");
        }
    }

// Display interface
public interface Display {
    public void update(float temperature, float humidity, float pressure);
    display();
}

// CurrentConditions class implementing Display interface
class CurrentConditions implements Display {
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("Current conditions: Temperature %.2f°F, Humidity %.2f%%, Pressure %.2f hPa%n", temperature, humidity, pressure);
    }
}

// StatisticsDisplay class implementing Display interface
class StatisticsDisplay implements Display {
    private float temperatureMin = Float.MAX_VALUE;
    private float temperatureMax = Float.MIN_VALUE;
    private float tempRunningTotal = 0.0f;
    private int numReadings = 0;

    public void update(float temperature, float humidity, float pressure) {
        temperatureMin = Math.min(temperatureMin, temperature);
        temperatureMax = Math.max(temperatureMax, temperature);
        tempRunningTotal += temperature;
        numReadings++;
        display();
    }

    public void display() {
        float averageTemp = tempRunningTotal / numReadings;
        System.out.printf("Temperature Statistics: Min %.2f°F, Max %.2f°F, Average %.2f°F%n", temperatureMin, temperatureMax, averageTemp);
    }
}

// ForecastDisplay class implementing Display interface
class ForecastDisplay implements Display {
    private float lastPressure;
    private float currentPressure;

    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
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


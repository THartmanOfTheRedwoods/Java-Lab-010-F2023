public class StatisticsDisplay {

    WeatherStation ws;

    float temperatureMin;

    float temperatureMax;
    float temperatureTotal;
    int numReadings;

    public StatisticsDisplay(WeatherStation ws) {
        this.ws = ws;
        ws.registerDisplay((Display) this);
        temperatureMin = Float.MAX_VALUE;
    }
    public void update() {
    }
}

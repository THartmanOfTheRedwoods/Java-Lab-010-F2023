import com.google.gson.Gson;

public class StatisticsDisplay implements Display{
    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;
    private int numReadings;
    public StatisticsDisplay(WeatherStation ws){
        this.ws = ws;
        ws.registerDisplay(this);

    }
    public void update(){
        float temperature = ws.getTemperature();
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
    public void display(){
        System.out.printf("Minimum Temp: %f%nMaximum Temp: %f%nAverage Temperature: %f", temperatureMin, temperatureMax, temperatureTotal);
    }
}

import com.google.gson.Gson;

public class StatisticsDisplay implements Display{
    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;
    private int numReadings;
    private Gson[] readings;
    public StatisticsDisplay(WeatherStation ws){
        update();

    }
    public void update(){
        temperatureMin = ws.measure();
    }
    public void display(){
        System.out.printf("Minimum Temp: %f%nMaximum Temp: %f%nAverage Temperature: %f", temperatureMin, temperatureMax, temperatureTotal);
    }
    public Gson[] temps(){
        float[] readings = new float[]{ws.getTemperature(), }
    }

}

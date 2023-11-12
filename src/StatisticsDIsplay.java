import java.util.ArrayList;
import java.util.List;

public class StatisticsDIsplay implements Display{
    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;
    private int numReadings;
    public void StatisticsDisplay(WeatherStation ws){
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.temperatureTotal = temperatureTotal;
        this.numReadings = numReadings;
    }
    public void update(){

        for (Display d : ){

        }

    }
    public void display(){
    ws.notifyDisplays();
    }
}

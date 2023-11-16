import java.io.IOException;

public class WeatherClient {
    public static void main(String[] args){

        WeatherStation ws = new WeatherStation();
        Display disp1 = new CurrentConditions(ws);
        Display disp2 = new StatisticsDisplay(ws);
        Display disp3 = new ForecastDisplay(ws);
        try {
            ws.measure();
        } catch ( IOException e){
            System.err.println("Bad weather URL");
        }
    }

}

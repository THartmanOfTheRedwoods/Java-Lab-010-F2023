import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Display display1 = new CurrentConditions(ws);
        Display display2 = new StatisticsDisplay(ws);
        Display display3 = new ForecastDisplay(ws);
        try {
            ws.measure();
            //System.out.println(ws.getTemperature());
        } catch (IOException e) {
            System.err.println("Failed to read weather from URL");
        }
    }
}

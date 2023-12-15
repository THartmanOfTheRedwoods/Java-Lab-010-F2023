import java.io.IOException;

public class Main {

          public static void main(String[] args) {
                    WeatherStation ws = new WeatherStation();
                    try {
                              ws.registerDisplay(new CurrentConditions(ws));
                              ws.registerDisplay(new ForecastDisplay(ws));
                              ws.registerDisplay(new StatisticsDisplay(ws));
                              ws.measure();

                    } catch (IOException e) {
                              throw new RuntimeException(e);
                    }
          }

}
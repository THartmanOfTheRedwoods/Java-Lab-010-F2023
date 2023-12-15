import java.io.IOException;

public class Main {

          public static void initDisplays(WeatherStation ws){
                    ws.registerDisplay(new CurrentConditions(ws));
                    ws.registerDisplay(new ForecastDisplay(ws));
                    ws.registerDisplay(new StatisticsDisplay(ws));
          }

          public static void main(String[] args) {
                    WeatherStation ws = new WeatherStation();
                    try {
                              initDisplays(ws);
                              ws.measure();                                     //IF LOOP TO REPEAT PROGRAM

                    } catch (IOException e) {
                              throw new RuntimeException(e);
                    }
          }

}
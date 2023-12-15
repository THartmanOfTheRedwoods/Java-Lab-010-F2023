import java.io.IOException;

public class Main {

          public static void main(String[] args) {
                    WeatherStation ws = new WeatherStation();
                    try {
                              ws.measure();

                    } catch (IOException e) {
                              throw new RuntimeException(e);
                    }
          }

}
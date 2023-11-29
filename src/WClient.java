import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WClient {
    public static String currentTime() {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a format for the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format and display the current date and time
        String formattedDateTime = currentDateTime.format(formatter);
        return ("Current Date and Time: " + formattedDateTime);
    }
    public static void main(String[]args){
        while (true) {


            System.out.println(currentTime());
            WeatherStation ws = new WeatherStation();
            Display[] ds = new Display[]{
                    new CurrentConditions(ws),
                    new StatisticsDisplay(ws),
                    new ForecastDisplay(ws)};
            try {
                ws.measure();
                try {
                    Thread.sleep(43200000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e) {
                System.out.println("Couldn't measure temperature.");
            }
        }


    }
}

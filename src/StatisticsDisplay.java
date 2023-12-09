import com.google.gson.Gson;

import java.net.URL;

public class StatisticsDisplay implements Display {
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;

    private int numReadings;
    private Gson gson;
    private URL url;

    WeatherStation ws = new WeatherStation();
    public StatisticsDisplay(WeatherStation weatherStation) {
        weatherStation.registerDisplay(this);
    }

   @Override
    public void update() {
       float temperature = ws.getTemperature();
        temperatureTotal += temperature;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.numReadings = numReadings;
    }


     double tempAv = (temperatureTotal/numReadings);

    @Override
    public void display() {
        System.out.printf("Minimum Temperature: %a%nMaximum Temperature: %a%nAverage Temperature: %a%n", temperatureMin, temperatureMax, tempAv  );

    }
}


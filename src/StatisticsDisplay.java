public class StatisticsDisplay implements Display{

          private static WeatherStation ws;
          private float temperatureMin;
          private float temperatureMax;
          private float temperatureAvg;
          private int numReadings;

          public StatisticsDisplay(WeatherStation ws){
                    this.ws = ws;

          }

          @Override
          public void update() {
                    this.temperatureMin = ws.getTemperatureMin();
                    this.temperatureMax = ws.getTemperatureMax();
                    this.temperatureAvg = (ws.getTemperatureMin() + ws.getTemperatureMax()) / 2;
          }

          @Override
          public void display() {
                    System.out.println("sd");               //scaffold
          }
}

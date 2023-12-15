public class CurrentConditions implements Display{

          private static WeatherStation ws;
          private float temperature;
          private float humidity;


          public CurrentConditions(WeatherStation ws) {
                    this.ws = ws;
          }

          @Override
          public void update() {
                    this.temperature = ws.getTemperature();
                    this.humidity = ws.getHumidity();
          }

          @Override
          public void display() {
                    System.out.println("cc");               //scaffold
          }
}

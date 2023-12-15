public class ForecastDisplay implements Display{

          private static WeatherStation ws;
          private float currentPresure;
          private float lastPressure;

          public ForecastDisplay(WeatherStation ws) {
                    this.ws = ws;
          }

          @Override
          public void update() {
                    this.currentPresure = ws.getPressure();
          }

          @Override
          public void display() {
                    System.out.println("fd");               //scaffold
          }
}

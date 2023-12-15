public class ForecastDisplay implements Display{

          private static WeatherStation ws;
          private float currentPresure;
          private float lastPressure;                       //field is essentially not doing anything

          public ForecastDisplay(WeatherStation ws) {
                    this.ws = ws;
          }

          @Override
          public void update() {
                    this.currentPresure = ws.getPressure();
          }

          @Override
          public void display() {
                    System.out.printf("FORECAST: %nLast Pressure: %.1f in HG%nPressure: %.1f in HG%n%n", lastPressure, currentPresure);
          }
}

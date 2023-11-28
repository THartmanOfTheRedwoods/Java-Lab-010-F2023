/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
public class CurrentConditions implements Display{
    private WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;
public CurrentConditions(WeatherStation ws){
    this.ws = ws;
    this.ws.registerDisplay(this);
}
  public void update(){
      this.temperature = ws.getTemperature();
      this.humidity = ws.getHumidity();
      this.pressure = ws.getPressure();
      display();
  }
  public void display(){
      System.out.printf("Current Condition: Temperature = %f°C, Humidity = %f%%, Pressure = %fin",
              temperature,
              humidity,
              pressure);
  }
}
public class CurrentConditions implements Display{
    private WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;
    public CurrentConditions(WeatherStation ws) {
    update();
    }

    public void update(){
      temperature = ws.getTemperature();
      humidity = ws.getHumidity();
      pressure = ws.getPressure();
      display();
    }
    public void display(){
        System.out.printf("Temperature: %f%nHumidity: %f%nPressure: %f%n", temperature,humidity,pressure);
    }

}

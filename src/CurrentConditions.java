public class CurrentConditions implements Display{
    private WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;
    public void currentConditions(WeatherStation ws) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;


    }
    public void update(){
        temperature = ws.getTemperature();
        humidity = ws.getHumidity();
        pressure = ws.getPressure();
        display();

    }
    public void display(){
        System.out.println("Temperature: " + temperature + "%nHumidity: " + humidity + "%nPressure: " + pressure);
    }
}

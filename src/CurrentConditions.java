

public class CurrentConditions implements Display {
    private WeatherStation ws;
    private float temperature;

    private float humidity;
    private float pressure;

    public CurrentConditions(WeatherStation ws){
        this.ws = ws;
        this.ws.registerDisplay( this);
    }

    public void update(){
        this.temperature = ws.getTemperature();
        this.humidity = ws.getHumidity();
        display();
    }
    public void display(){
        System.out.printf("Current conditions : Temperature = %f C, Humidity = %f%%, Pressure = %finHG%n", temperature, humidity, pressure);
    }
}

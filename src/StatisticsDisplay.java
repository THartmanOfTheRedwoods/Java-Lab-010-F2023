public class StatisticsDisplay implements Display {

    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;
    private float numReadings;

    public StatisticsDisplay(WeatherStation ws) {
        this.ws = ws;
        this.ws.registerDisplay( this);
    }

    public void update(){
        float temperature = ws.getTemperature();
        temperatureTotal += temperature;
        numReadings++;

        if( numReadings == 1 || temperature < temperatureMin){
            temperatureMin = temperature;
        }
        if( numReadings == 1 || temperature > temperatureMax){
            temperatureMax = temperature;
        }
       display();
    }
    public void display(){
        System.out.printf("Temperature minimum = %f C, Temperature maximum = %f C, Temperature Average = %f C"
                ,temperatureMin, temperatureMax, temperatureTotal);
    }
}

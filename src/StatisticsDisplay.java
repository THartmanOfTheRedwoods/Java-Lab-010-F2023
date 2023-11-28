/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
class StatisticsDisplay implements Display {
    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;
    private int numReadings;

    public StatisticsDisplay(WeatherStation ws) {
            this.ws =ws;
            this.ws.registerDisplay(this);
    }

    public void update(){
        float temperature = ws.getTemperature();
        temperatureTotal += temperature;
        numReadings++;

        if (numReadings == 1 || temperature <temperatureMin){
            temperatureMin = temperature;
    }
    if (numReadings == 1 || temperature > temperatureMax){
        temperatureMax = temperature;
}
display();
}

    @Override
    public void display() {
        System.out.println("Statistics: Min Temperature = " + temperatureMin + "°C, Max Temperature = " +
                temperatureMax + "°C, Average Temperature = " + (temperatureTotal / numReadings) + "°C");
    }
}

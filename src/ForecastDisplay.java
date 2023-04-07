public class ForecastDisplay implements Display {

    private WeatherStation ws;

    private float currentPressure;

    private float lastPressure;

    public ForecastDisplay(WeatherStation ws){
        this.ws = ws;
        this.ws.registerDisplay(this);
    }

    public void update(){
        lastPressure = currentPressure;
        currentPressure = ws.getPressure();
        display();
    }

    public void display(){
        System.out.println("Forecast : Current Pressure = " + currentPressure + ", Last Pressure = "+ lastPressure);
    }

}
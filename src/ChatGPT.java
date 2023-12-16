import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

class ChatGPT {
    private URL url;
    private List<Display> displays;
    private float temperature;
    private float humidity;
    private float pressure;
    // Assume Gson class is available
    private Gson gson;

    public ChatGPT() {
        this.displays = new ArrayList<>();
        this.gson = new Gson();
    }

    public void registerDisplay(Display display) {
        displays.add(display);
    }

    public void removeDisplay(Display display) {
        displays.remove(display);
    }

    public void notifyDisplays() {
        for (Display display : displays) {
            display.update();
        }
    }

    public float getTemperature() {
        // Implement the logic to get temperature data
        return temperature;
    }

    public float getHumidity() {
        // Implement the logic to get humidity data
        return humidity;
    }

    public float getPressure() {
        // Implement the logic to get pressure data
        return pressure;
    }

    public void measure() {
        // Implement the logic to measure temperature, humidity, and pressure
        // Update the class fields (temperature, humidity, pressure)
        // Notify displays after measurements
        notifyDisplays();
    }
}
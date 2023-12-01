import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final URL url;
    private final List<Display> displays;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        displays = new ArrayList<>();
        try {
            url = new URL("https://api.openweathermap.org/data/2.5/weather?q=Loleta,us&units=imperial&APPID=132cb2f1db987da116d403e616723290");
        } catch (MalformedURLException m) {
            throw new RuntimeException(m);
        }
    }

    public void registerDisplay(Display d) {
        displays.add(d);
    }

    public void removeDisplay(Display d) {
        displays.remove(d);
    }

    public void notifyDisplays() {
        for (Display d : displays) {
            d.update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public static float hPaToInHG(float hPa) {
        return hPa * 0.029529983071445f;
    }

    public void measure() throws IOException {
        InputStreamReader reader = new InputStreamReader(url.openStream());
        // ... (your JSON parsing logic)

        // Simulate measurement values
        this.temperature = 75.5f;
        this.humidity = 60.2f;
        this.pressure = WeatherStation.hPaToInHG(30.1f);

        notifyDisplays();
    }
}
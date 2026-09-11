package coherence;

// TODO: Analyze if cohesion of this class is high or low, explain why
public class WeatherStation {
    private double temperature;
    private double humidity;

    public double getTemperature() { return temperature; }
    public double getHumidity() { return humidity; }

    public void recordMeasurement(double t, double h) {
        this.temperature = t;
        this.humidity = h;
    }
}

package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 17:24
 */
public class WeatherData implements Subject {
    private List<Observer> obs;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        obs = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : obs) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temp,float humi,float pressure) {
        temperature=temp;
        humidity=humi;
        this.pressure=pressure;
    }
}

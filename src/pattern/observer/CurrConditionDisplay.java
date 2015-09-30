package pattern.observer;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 17:36
 */
public class CurrConditionDisplay implements Observer, DisplayElement {
    Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrConditionDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.register(this);
    }

    @Override
    public void update(float temp, float humi, float pressure) {
        this.temperature = temp;
        this.humidity = humi;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + " C," + humidity + "%");
    }
}

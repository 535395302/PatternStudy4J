package pattern.observer;

import pattern.command.RemoteControl;
import pattern.command.cmmds.LightOffCommand;
import pattern.command.cmmds.LightOnCommand;
import pattern.command.domain.Light;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrConditionDisplay currDisplay = new CurrConditionDisplay(weatherData);

        weatherData.setMeasurements(13L,20L,3L);

        weatherData.notifyObservers();
    }
}

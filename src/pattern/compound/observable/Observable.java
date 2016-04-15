package pattern.compound.observable;


import java.util.ArrayList;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-14 11:02
 */
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Object observer : observers) {
            ((pattern.compound.observable.Observer)observer).update(duck);
        }
    }
}

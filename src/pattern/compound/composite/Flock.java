package pattern.compound.composite;

import pattern.compound.interf.Quackable;
import pattern.compound.observable.Observable;
import pattern.compound.observable.Observer;

import java.util.ArrayList;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-14 10:34
 */
public class Flock implements Quackable {
    Observable observable;
    ArrayList<Quackable> quackers = new ArrayList();

    public Flock() {observable = new Observable(this);
    }

    /**
     * ½ÐÒ»´Î
     */
    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void registerObserver(pattern.compound.observable.Observer observer) {
        for (Quackable duck : quackers) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Quackable duck : quackers) {
            duck.notifyObservers();
        }
    }
}

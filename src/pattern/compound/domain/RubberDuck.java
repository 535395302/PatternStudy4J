package pattern.compound.domain;

import pattern.compound.interf.Quackable;
import pattern.compound.observable.Observable;
import pattern.compound.observable.Observer;

/**
 * ÏðÆ¤Ñ¼
 * @author Tian
 * @version 1.0
 * @date 2016-04-11 17:12
 */
public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {observable = new Observable(this);
    }

    /**
     * ½ÐÒ»´Î
     */
    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(pattern.compound.observable.Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}

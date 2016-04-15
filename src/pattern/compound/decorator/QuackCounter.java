package pattern.compound.decorator;

import pattern.compound.interf.Quackable;
import pattern.compound.observable.Observable;
import pattern.compound.observable.Observer;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-11 17:57
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    /**
     * ½ÐÒ»´Î
     */
    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}

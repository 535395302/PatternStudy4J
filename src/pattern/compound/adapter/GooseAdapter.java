package pattern.compound.adapter;

import pattern.compound.domain.Goose;
import pattern.compound.interf.Quackable;
import pattern.compound.observable.Observable;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-11 17:42
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose=goose;observable = new Observable(this);
    }

    /**
     * ½ÐÒ»´Î
     */
    @Override
    public void quack() {
        goose.honk();
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

package pattern.compound.observable;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-14 10:57
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}

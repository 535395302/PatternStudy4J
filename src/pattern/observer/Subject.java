package pattern.observer;

/**
 * @author Tian
 * @date 2015/9/30
 */
public interface Subject {
    void register(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}

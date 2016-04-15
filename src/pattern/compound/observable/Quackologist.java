package pattern.compound.observable;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-14 11:14
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}

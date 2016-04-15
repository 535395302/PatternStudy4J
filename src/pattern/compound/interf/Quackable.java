package pattern.compound.interf;

import pattern.compound.observable.QuackObservable;

/**
 * 行为：呱呱叫
 * @author Tian
 * @date 2016/4/11
 */
public interface Quackable extends QuackObservable {

    /**
     * 叫一次
     */
    void quack();
}

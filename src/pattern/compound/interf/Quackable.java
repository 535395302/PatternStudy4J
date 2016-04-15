package pattern.compound.interf;

import pattern.compound.observable.QuackObservable;

/**
 * ��Ϊ�����ɽ�
 * @author Tian
 * @date 2016/4/11
 */
public interface Quackable extends QuackObservable {

    /**
     * ��һ��
     */
    void quack();
}

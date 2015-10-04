package pattern.state;

/**
 * 状态接口
 * Created by tian on 10/4/15.
 */
public interface State {
    /**
     * 投入25分
     */
    void insertQuarter();

    /**
     * 取回25分
     */
    void enjectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}

package pattern.command.domain;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 15:46
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
    }

    public void off() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

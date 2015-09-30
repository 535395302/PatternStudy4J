package pattern.command.cmmds;

import pattern.command.Command;
import pattern.command.domain.Light;

/**
 * turn on light
 *
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 15:48
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public LightOnCommand() {
    }

    @Override
    public void execute() {
        System.out.println("ON light: " + light.getName());
    }

}

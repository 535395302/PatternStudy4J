package pattern.command.cmmds;

import pattern.command.Command;
import pattern.command.domain.Light;

/**
 * turn off light
 *
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 15:55
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public LightOffCommand() {
    }

    /**
     * Ö´ÐÐ·½·¨
     */
    @Override
    public void execute() {
        System.out.println("OFF light: " + light.getName());
    }


}

package pattern.command;

import pattern.command.cmmds.LightOffCommand;
import pattern.command.cmmds.LightOnCommand;
import pattern.command.domain.Light;

public class Main {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light light = new Light("R1");
        control.setCommand(0,new LightOnCommand(light),new LightOffCommand(light));

        control.onButton(0);
        control.offButton(0);
    }
}

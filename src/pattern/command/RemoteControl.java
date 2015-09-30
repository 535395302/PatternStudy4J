package pattern.command;

import pattern.command.cmmds.NoCommand;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 16:02
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[2];
        offCommands = new Command[2];

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * set command
     * @param posi the position
     * @param onCommand turn on
     * @param offCommand turn off
     */
    public void setCommand(int posi, Command onCommand, Command offCommand) {
        onCommands[posi] = onCommand;
        offCommands[posi] = offCommand;
    }

    public void onButton(int posi){
        onCommands[posi].execute();
    }
    public void offButton(int posi){
        offCommands[posi].execute();
    }
}

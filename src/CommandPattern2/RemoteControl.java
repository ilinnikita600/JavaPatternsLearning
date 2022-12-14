package CommandPattern2;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        int numOfButtons = 7;
        onCommands = new Command[numOfButtons];
        offCommands = new Command[numOfButtons];
        Command noCommand = new NoCommand();
        for (int i = 0; i < numOfButtons; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
        undoCommand = new NoCommand();
    }
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + String.format("%-30s",onCommands[i].getClass().getSimpleName())
                    +offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuff.toString();
    }
}

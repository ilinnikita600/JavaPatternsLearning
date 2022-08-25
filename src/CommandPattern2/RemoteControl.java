package CommandPattern2;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        int numOfButtons = 7;
        onCommands = new Command[numOfButtons];
        offCommands = new Command[numOfButtons];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numOfButtons; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
}

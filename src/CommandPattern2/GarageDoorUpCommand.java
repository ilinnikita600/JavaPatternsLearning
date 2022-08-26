package CommandPattern2;

public class GarageDoorUpCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
    public void undo() { garageDoor.down(); }
}

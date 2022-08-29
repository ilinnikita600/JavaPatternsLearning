package CommandPattern2;

public class HottubOnCommand implements Command {
    private final Hottub hottub;
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    public void execute() {
        hottub.jetsOn();
    }
    public void undo() {
        hottub.jetsOff();
    }
}

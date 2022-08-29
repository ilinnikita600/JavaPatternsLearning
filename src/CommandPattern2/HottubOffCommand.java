package CommandPattern2;

public class HottubOffCommand implements Command {
    private final Hottub hottub;
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    public void execute() {
        hottub.jetsOff();
    }
    public void undo() {
        hottub.jetsOn();
    }
}

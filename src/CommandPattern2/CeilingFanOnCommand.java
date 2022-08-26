package CommandPattern2;

public class CeilingFanOnCommand implements Command {
    private final CeilingFan ceilingFan;
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.on();
    }
    public void undo() { ceilingFan.off(); }
}

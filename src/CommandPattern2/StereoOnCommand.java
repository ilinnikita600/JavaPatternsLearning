package CommandPattern2;

public class StereoOnCommand implements Command {
    private final Stereo stereo;
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.on();
    }
    public void undo() {
        stereo.off();
    }
}

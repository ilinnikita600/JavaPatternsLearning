package CommandPattern2;

public class CeilingFan {
    public void high() {}
    public void medium() {}
    public void low() {}
    public void off() { System.out.println("Ceiling fan is turned off"); }
    public void on() { System.out.println("Ceiling fan is turned on"); }
    public int getSpeed() { return 0;}
}

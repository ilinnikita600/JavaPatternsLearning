package CommandPattern2;

public class CeilingFan {
    private final String place;
    public CeilingFan(String place) {
        this.place = place;
    }
    public void high() {}
    public void medium() {}
    public void low() {}
    public void off() { System.out.println("Ceiling fan is turned off"); }
    public void on() { System.out.println("Ceiling fan is turned on"); }
    public int getSpeed() { return 0;}
    public String getPlace() {
        return place;
    }
}

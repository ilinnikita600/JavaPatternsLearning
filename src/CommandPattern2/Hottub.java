package CommandPattern2;

public class Hottub {
    private final String place;
    private int t;
    public Hottub(String place) {
        this.place = place;
        t = 0;
    }
    public void circulate() {
        System.out.println("Circulate");
    }
    public void jetsOn() {
        System.out.println("jets On");
    }
    public void jetsOff() {
        System.out.println("jets off");
    }
    public void setTemperature(int t) {
        this.t = t;
    }
    public String getPlace() {
        return place;
    }
}

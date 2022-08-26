package CommandPattern2;

public class Light {
    private final String place;
    public Light(String place) {
        this.place = place;
    }
    public void on() {
        System.out.println("Свет включен");
    }
    public void off() {
        System.out.println("Свет выключен");
    }
    public String getPlace() {
        return place;
    }
}

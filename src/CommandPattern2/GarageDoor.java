package CommandPattern2;

public class GarageDoor {
    private final String place;
    private boolean light;
    public GarageDoor(String place) {
        light = false;
        this.place = place;
    }
    public void up() {
        System.out.println("Гаражная дверь открыта");
    }

    public void down() {
        System.out.println("Гаражная дверь закрыта");
    }

    public void stop() {}
    public void lightOn() {
        if (!light) System.out.println("Свет включен");
        else System.out.println("Свет уже был включен");
        light = !light;
    }
    public void lightOff() {
        if (light) System.out.println("Свет выключен");
        else System.out.println("Свет уже был выключен");
        light = !light;
    }
    public String getPlace() {
        return place;
    }
}

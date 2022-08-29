package CommandPattern2;

public class TV {
    private int volume;
    private final String place;

    public TV(String place) {
        volume = 0;
        this.place = place;
    }
    public void on() {
        System.out.println("Телевизор включен");
    }
    public void off() {
        System.out.println("Телевизор выключен");
    }
    public void setInputChannel() {
        System.out.println("Канал установлен");
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
}

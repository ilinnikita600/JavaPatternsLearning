package CommandPattern2;

public class TV {
    private int volume;

    public TV() {
        volume = 0;
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

package CommandPattern2;

public class Stereo {
    private final String place;
    private int volume;
    public Stereo(String place) {
        volume = 0;
        this.place = place;
    }
    public void on() {

    }
    public void off() {

    }
    public void setCd() {
        System.out.println("CD-диск вставлен");
    }
    public void setDVD() {
        System.out.println("DVD-диск вставлен");
    }
    public void setRadio() {
        System.out.println("Радио-канал установлен");
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String getPlace() {
        return place;
    }
}

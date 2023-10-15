package Iphone;

public class iPhone implements MusicPlayer, InternetBrowser {
    private String model;
    private String color;
    private double size;

    public iPhone(String model, String color, double size) {
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public void powerOn() {
        System.out.println("iPhone is powered on.");
    }

    public void powerOff() {
        System.out.println("iPhone is powered off.");
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    public void sendMessage(String receiver, String message) {
        System.out.println("Sending message to " + receiver + ": " + message);
    }

    public void play() {
        System.out.println("Playing music...");
    }

    public void pause() {
        System.out.println("Pausing music...");
    }

    public void nextTrack() {
        System.out.println("Playing next track...");
    }

    public void previousTrack() {
        System.out.println("Playing previous track...");
    }

    public void openURL(String url) {
        System.out.println("Opening URL: " + url);
    }

    public void back() {
        System.out.println("Navigating back in the browser.");
    }

    public void forward() {
        System.out.println("Navigating forward in the browser.");
    }

    public void refresh() {
        System.out.println("Refreshing the browser page.");
    }
}

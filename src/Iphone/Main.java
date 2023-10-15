package Iphone;

public class Main {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone("iPhone", "Silver", 4.5);
        myiPhone.powerOn();
        myiPhone.makeCall("123-456-7890");
        myiPhone.play();
        myiPhone.openURL("https://www.google.com");
    }
}
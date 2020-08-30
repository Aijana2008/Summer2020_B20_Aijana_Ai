package day48_Inheritance.DeviceTask;

public class Phone  extends Device {
    public static boolean hasSimCard = true;
    public String OS;

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize, String OS){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.OS = OS;
    }

    public void call(long phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting to: "+phoneNumber);
    }

}

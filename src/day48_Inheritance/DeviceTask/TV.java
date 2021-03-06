package day48_Inheritance.DeviceTask;
/*
 2. create a sub class of Device called TV:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, RemoteControl
                    methods: watch, setInfo, toString

 */
public class TV   extends Device{
    /*
    Inherited: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize
    methods: setInfo, toString
     */
/*
not inherited:
variable: remoteControl
methods: watch
 */


    public boolean hasRemoteControl;

    public TV(String brand, String model, double price, String screenSize, boolean hasBattery, boolean hasMemory, boolean hasRemoteControl){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.hasRemoteControl = hasRemoteControl;
    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }
}

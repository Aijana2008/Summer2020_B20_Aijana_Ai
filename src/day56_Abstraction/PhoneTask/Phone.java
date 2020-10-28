package day56_Abstraction.PhoneTask;
/*
 1. create an abstract class called Phone
            attributes: brand, model, price, size
            abstract methods: calling(), texting();
            instance method: toString()
            add a constructor that can initialize all the instances
 */
public abstract class Phone {

    public String Brand;
    public String model;
    public double price;
    public String size;


    public abstract void calling(long num1, long num2);
    public abstract void calling(long phoneNumber);

    public abstract void texting(long num1, long num2);
    public abstract void texting(long phoneNumber);

    @Override
    public String toString() {
        return "Phone{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }


    public Phone(String brand, String model, double price, String size) {
        Brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;


    }
}
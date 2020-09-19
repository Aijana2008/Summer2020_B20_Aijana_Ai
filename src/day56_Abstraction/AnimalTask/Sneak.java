package day56_Abstraction.AnimalTask;

public class Sneak extends Animal{
    @Override
    public void eat() {
        System.out.println("Sneak is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sneak is sleeping");
    }
}

package day56_Abstraction.AnimalTask;

public class Eagle extends Animal implements Flyable, Playable{
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void play() {
        System.out.println("Eagle is playing");
    }
}

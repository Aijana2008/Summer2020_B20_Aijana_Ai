package day48_Inheritance.AnimalTask;

public class Cat extends Animal {

    /*
    variables: 5
    methods: 5
     */
public String color;

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", lb=" + lb +
                '}';
    }

    public Cat(String name, String size, int age, char gender, String breed, double lb, String color) {

        setInfo(name, size, age, gender, breed, lb );
        this.color= color;
    }


    public void meow(){
        System.out.println(name + " meowing");
    }
}

package day49_Inheritance.ScrumTeamTask;
/*
warmup tasks:
        create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo


 */
public class Person {

    public String name;
    public int age;
    public char gender;

    private long ssn;

    public long getSsn(){
        return ssn;
    }  // getter is read only

    public void setSsn(long ssn){
        this.ssn = ssn;
    } // setter set ssn only




    private void eat(){  // we dont want this to be inherited to the sub classes
        System.out.println(name+" is eating");
    }
    private void walk(){ // we dont want this to be inherited to the sub classes
        System.out.println(name+" is walking");
    }
    public void sleep(){ // we dont want this to be inherited to the sub classes
        System.out.println(name+" is sleeping");
    }

    public void setInfo(String name, int age, char gender){ // setInfo methods only sets name, age, gender
        this.name= name;
        this.age=age;
        this.gender=gender;
    }

}

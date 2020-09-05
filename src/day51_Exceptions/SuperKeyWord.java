package day51_Exceptions;

class Test{

    int a; //200;

    public void method(){
        System.out.println("Hello");
    }
    public void m(){
        this.method();

    }

}
public class SuperKeyWord extends Test {
//a = 300
    public void print1(){
        //System.out.println(this.a);
        System.out.println(a);    // SuperKeyWord a ==>300
    }

    public void print2(){
        System.out.println(super.a);  // Test  a ==>200
    }
    public void method2(){
        super.method(); //hello
        System.out.println("Hola");  // Hola
    }

    public void method3(){
        this.method2();
        super.method();
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 200;

        SuperKeyWord obj2= new SuperKeyWord();
        obj2.a = 300;


        obj2.print1();
        obj2.print2();

        obj2.method();


        System.out.println("==================================");

        obj2.method3();
    }
}

package day51_Exceptions;

class X{
    public X(){
        System.out.println("X");
    }
}
class Y{
    public Y(){
        //super();//X
        System.out.println("Y");
    }
}
class Z extends Y{
    public Z(){
        //super();//Z Y
        System.out.println("Z");
    }
}
public class Practice {

    public static void main(String[] args) {

        new Z();
    }
}

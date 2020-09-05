package day51_Exceptions;

import java.util.ArrayList;

public class ExeptionHandling {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();  // empty

        String exeptionMessege = "";
        try{
            System.out.println(list.get(1));
        }catch (IndexOutOfBoundsException e){
            exeptionMessege = e.getMessage();
        }

        System.out.println("next step");
        System.out.println(exeptionMessege);
    }
}

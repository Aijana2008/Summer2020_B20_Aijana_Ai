package day61_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSelfPractice {

    public static void main(String[] args) {
        Map<String, Integer> students =  new LinkedHashMap<>();

        students.put("Zuhal",90);
        students.put("Dilya",90);
        students.put("Saodat",90);
        students.put("Asli",90);
        students.put("Aijana",73);

        for (String each: students.keySet()){
            int value = students.get(each);
            if(value <=80){
                System.out.println(each);
            }
        }




    }
}

package day61_Maps.Practice;

import java.util.*;

/*
1. Write a program that stores the the character and frequency of each character from a String in to a Map

    Ex: "aaabbbccb"
    output:
        {a=3, b=4, c=2}

 */
public class Warmups {

    public static void main(String[] args) {

        String str = "aaabbbccb";
        List<String> list = Arrays.asList(str.split(""));
        Set<String> CharSet = new LinkedHashSet<>(list);
        Map<String, Integer> CharMap = new LinkedHashMap<>();
        for (String each : CharSet) {
            CharMap.put(each, Collections.frequency(list,each));
        }
        System.out.println(CharMap);

        System.out.println("==============================");
/*
2. write a program that stores the unique characters from a string into map:

        Ex: "abacbdeef";
        output:
            {c=1, d=1, f=1}
 */

        String str1 = "abacbdeef";
        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        Map<String, Integer> CharMap1 = new LinkedHashMap<>();
        for(String each : list1) {
            if(Collections.frequency(list1, each)==1 ){
                CharMap1.put(each,Collections.frequency(list1,each));


            }

        }

        System.out.println(CharMap1);












    }
}

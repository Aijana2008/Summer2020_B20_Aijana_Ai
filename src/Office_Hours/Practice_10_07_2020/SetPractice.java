package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String[] names = {"Dawud", "Selman", "Aslan", "Aslan", "Aslan", "Aslan"};

        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(names));
        System.out.println("Hash Set: "+hashSet);


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(names));// keeps the insertion order as it is
        System.out.println(linkedHashSet);


        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(names));// always sorts objects, in ascending order
        System.out.println("Tree Set:" + treeSet);


    }
}

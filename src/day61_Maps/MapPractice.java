package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> employees = new LinkedHashMap<>();
        employees.put("Elvira", 100000.0);
        employees.put("Ziiadin", 120000.0);
        employees.put("Roman", 130000.0);
        employees.put("Cihan", 140000.0);
        employees.put("Aizhan", 120000.0);

        System.out.println(employees);
        System.out.println(employees.size());

        System.out.println("Salary of Ziiadin: $"+120000.5);

        boolean r2 = employees.containsValue(120000.5);

        System.out.println(r2);

        boolean r3 = employees.containsValue(150000.0);

        System.out.println(r3);

        employees.clear();

        System.out.println(employees);

    }
}

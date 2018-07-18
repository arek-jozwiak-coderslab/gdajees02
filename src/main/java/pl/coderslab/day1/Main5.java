package pl.coderslab.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main5 {

    public static void main(String[] args) {
        Map<String, String>  countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");

        Set<String> keys = countries.keySet();


        for (String key: keys ) {
            System.out.print("key : ");

            System.out.print(key);
            System.out.print(" value  : ");
            System.out.println(countries.get(key));

        }
        System.out.println(countries);

    }
}

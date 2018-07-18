package pl.coderslab.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main7 {

    public static void main(String[] args) {
        Map<String, String> map = getMap();
        Set<String> keys = map.keySet();
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (String key : keys) {
            System.out.println("Podaj przeciwieństwo...");
            System.out.println(key);

            if (scanner.nextLine().equals(map.get(key))) {
                result++;
            }
        }
        System.out.println("Result = " + result);


        boolean some = false;

        if (some) {

        }
    }


    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("biały", "czarny");
        map.put("ciepło", "zimno");
        // 5 razy
        return map;
    }
}

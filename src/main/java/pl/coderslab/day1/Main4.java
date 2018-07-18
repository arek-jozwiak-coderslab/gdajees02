package pl.coderslab.day1;

import java.util.HashSet;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {
        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("el1");
        myHashSet.add("el2");
        myHashSet.add("el1");

        System.out.println(myHashSet.size());
    }
}

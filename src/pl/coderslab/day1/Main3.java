package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        for (int i=0; i<10; i++){
            elements.add(i);
        }

        List<Integer> newList = removeDivider(elements, 2);
        for (Integer el : newList) {
            System.out.println(el);
        }
    }


    public static List<Integer> removeDivider(List<Integer> list, int divider) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % divider == 0) {
                it.remove();
            }
        }
        return list;
    }
}

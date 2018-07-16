package pl.coderslab.day1;

import java.util.*;

public class Main1 {

    public static void renove(){

    }

    public static void main(String[] args) {
        renove();
        int[] tab = new int[10];
        System.out.println(tab.length);

        List<String> myList = new ArrayList<>();
        myList.add("Thinking in Java");
        myList.add("Thikning in Java");

        System.out.println(myList.size());

        for (String s: myList) {
            System.out.println(s);
        }


        Iterator<String> it = myList.iterator();

        System.out.println(myList.get(1));

        while (it.hasNext()){
            String  s = it.next();
            System.out.println(s);
        }


        List<Integer> someInts = new ArrayList<>();
        someInts.add(12);
        someInts.add(11);
        int someResult = someInts.get(0);
        System.out.println(someResult);

        ListIterator<String> itl = myList.listIterator();


//        doSth(new ArrayList<>());
//        doSth(new LinkedList<>());

    }

    public static void doSoth(List<String> someList){

    }
}

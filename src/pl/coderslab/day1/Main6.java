package pl.coderslab.day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6 {

    public static void main(String[] args) {
        Set<String> newHashset = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.println("Wprowadź napis");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            newHashset.add(input);
            count++;
        }
        System.out.println("Podanych napisów: " + count + " Rozmiar kolekcji: " + newHashset.size());
    }
}

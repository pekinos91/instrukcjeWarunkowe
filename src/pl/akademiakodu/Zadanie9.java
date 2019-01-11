package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz 1");
        String firstWord = scanner.next();
        System.out.println("Podaj wyraz 2");
        String secondWord = scanner.next();



//        if (firstWord.equals(secondWord)) {
//            System.out.println("Takie same");
//        }
//        else {
//            System.out.println("inne");
//        }
        System.out.println(firstWord.equals(secondWord) ? "Wyrazy są takie same":"Wyrazy są inne");




    }
}

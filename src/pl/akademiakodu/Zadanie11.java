package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz 1");
        String checkWord = scanner.next();
        String word = "kajak";
        boolean containsWord = checkWord.contains(word);

        System.out.println(containsWord?"Zawira":"nie zawiera");
    }
}

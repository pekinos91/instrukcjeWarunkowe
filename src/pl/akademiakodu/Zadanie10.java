package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz 1");
        String word = scanner.next();

        if (word.startsWith("http//") || word.startsWith("https//") || word.startsWith("www.")){
            System.out.println("jest poprawny");
        }
        else {
            System.out.println("nei jest poprawny");
        }






    }
}

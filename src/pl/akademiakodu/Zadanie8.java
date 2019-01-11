package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        int length = word.length();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(length - 1);

        if (firstLetter == lastLetter){
            System.out.println("Litery są takie same");
        }
        else
        {
            System.out.println("nie są takie same");
        }


    }
}

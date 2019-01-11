package pl.akademiakodu;

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {

        String password = "Akademia";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło");
        String word = scanner.next();


        if(word.equals(password)){
            System.out.println("Gratulacje podałeś dobre haśło");
        } else {
            System.out.println("złe hasło");
        }

    }
}

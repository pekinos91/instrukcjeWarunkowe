package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");
        int number = scanner.nextInt();

        if (number > 5){
            System.out.println("Liczba " + number + " jest większa od 5");
        }
        else  {
            System.out.println("Liczba " + number + " nie jest większa od 5");
        }



    }
}

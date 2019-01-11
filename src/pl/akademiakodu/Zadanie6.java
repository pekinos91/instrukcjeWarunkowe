package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int c = scanner.nextInt();

        int min = a<b ? a:b;

        if (c < min){
            System.out.println(c);
        }
        else {
            System.out.println(min);
        }

    }
}

package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
// Nie rozumiem pytania !! Dlaczego w odpowiedziach zmienne w ifie są podwójne??
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecią");
        int c = scanner.nextInt();

        if (a+b==c || a+c==b || b+c == a){
            System.out.println("tak");
        }
        else{
            System.out.println("nie");
        }
    }
}

package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
//        if (liczba % 3 == 0 || liczba % 5 == 0){
//            System.out.println("liczba jest podzielna przez 3 lub 5");
//        }else {
//            System.out.println("liczba nie jest podzielna przez 3 lub 5");
//        }
        System.out.println(liczba % 3==0 || liczba % 5 == 0?"liczba jest podzielna przez 3 lub 5": "liczba nie jest podzielna przez 3 lub 5");
    }
}

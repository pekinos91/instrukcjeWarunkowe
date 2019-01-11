package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba%3==0){

            System.out.println("Jest podzielna przez 3");
    } else {
            System.out.println("Nie jest podzielna przez 3");
        }

    }
}

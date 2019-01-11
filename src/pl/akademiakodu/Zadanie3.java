package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        String password = "Akademia";
        Scanner scanner = new Scanner(System.in);
        String wyraz = scanner.next();

        if (wyraz.equals(password)){
            System.out.println("dobre hasło");
        }
        else {
            System.out.println("złe hasło");
        }

    }
}

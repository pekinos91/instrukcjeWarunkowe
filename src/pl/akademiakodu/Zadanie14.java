package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
//        if (age<18){
//            System.out.println("nie jesteś pełnoletni");
//        }
//        else{
//            System.out.println("jesteś pełnoletni");
//        }
        System.out.println(age<18?"nie jesteś pełnoletni":"jestes pełnoletni");
    }
}

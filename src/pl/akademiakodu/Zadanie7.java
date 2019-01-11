package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();

        if ( word.endsWith("M") || word.endsWith("m") ){
            System.out.println("TAK");
        }
        else{
            System.out.println("NIE");
        }



    }
}

package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        //niektore imiona polskie koncza sie na a oraz wiele zagranicznych (sasza)
        Scanner scanner = new Scanner(System.in);
        System.out.println("POdaj imię");
        String imie = scanner.next();

        if (imie.endsWith("a")){
            System.out.println(imie + " to żeńskie imię");
        }
        else {
            System.out.println(imie + " męskie imię");
        }

    }
}

package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod pocztowy");
        String code = scanner.next();

        if(code.length() == 6 &&
                Character.isDigit(0)&&
                Character.isDigit(1) &&
                Character.isDigit(3) &&
                Character.isDigit(4)&&
                Character.isDigit(5) &&
                code.charAt(2) == '-'){
            System.out.println("poprawny kod pocztowy");
        }else {

            System.out.println("niepoprawny kod pocztowy");

        }
    }
}

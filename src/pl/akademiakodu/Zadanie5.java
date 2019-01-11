package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie5 {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = a>b ? a : b;
        //int min = a<b ? b : a;
        System.out.println(min);
    }

}

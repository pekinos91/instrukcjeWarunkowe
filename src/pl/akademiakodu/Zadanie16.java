package pl.akademiakodu;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą");
        int person1 = scanner.nextInt();
        System.out.println("Podaj drugą");
        int person2 = scanner.nextInt();

//        if (person1>=13 && person1<=18){
//            if (person2>=13 && person2<=18){
//                System.out.println("tak");
//            }else System.out.println("nie");
//        }else System.out.println("nie");
        // po podpowiedzi
        if(person1>=13&&person1<=18&&person2>=13&&person2<=18){
            System.out.println("tak");
        }else{
            System.out.println("nie");
        }
    }
}

package Tanya;

import java.util.Scanner;

public class PrimeFactors {

    public static void searchPrimeFactors(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer to be split into prime factors.");

        int num = scanner.nextInt();
        int a = 2;

        while (num !=1) {
            if (num % a == 0){
                System.out.println(a + "  ");
                num /= a;
            } else if (a == 2){
                a++;
            } else {
                a += 2;
            }
        }
    }
}

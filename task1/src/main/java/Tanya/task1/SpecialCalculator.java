package Tanya.task1;

import java.util.Scanner;

public class SpecialCalculator {

    public static void calculator (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random String.");

        String input = scanner.next();

        int sum = 0;

        char[] ch = input.toCharArray();

        for (int i=0; i<=ch.length -1; i++){
            if (Character.isDigit(ch[i])){
                char ch1 = ch[i];
                String s1 = Character.toString(ch1);
                int i1 = Integer.parseInt(s1);

                sum=sum+i1;
            }
        }
        System.out.println(sum);
    }
}



package org.example.dsa;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            number /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}

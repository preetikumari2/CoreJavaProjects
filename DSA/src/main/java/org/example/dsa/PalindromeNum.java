package org.example.dsa;

import java.util.Scanner;

public class PalindromeNum
{
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int tempNum=num;
        int r=0;
        while (num>0) {
            r=10*r+num%10;
            num=num/10;
        }
        if(tempNum==r)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

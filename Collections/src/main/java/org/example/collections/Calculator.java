package org.example.collections;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        // we are going to take input from user untill user presses X or x
        while(true){
            boolean isZeroDenom = false;
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter two numbers: ");
                int number1 = sc.nextInt();
                int number2 = sc.nextInt();
                if(op == '+'){
                    result = number1 + number2;
                }
                if(op == '-'){
                    result = number1 - number2;
                }
                if(op == '*'){
                    result = number1 * number2;
                }
                if(op == '/'){
                    if (number2 == 0){
                        isZeroDenom = true;
                        System.out.println("Number cannot be divided by 0");
                    } else{
                        result = number1 / number2;
                    }
                }
                if(op == '%'){
                    result = number1 % number2;
                }
            } else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid operator!");
            }
            if(!isZeroDenom)
                System.out.println("result: " + result);
        }
    }
}

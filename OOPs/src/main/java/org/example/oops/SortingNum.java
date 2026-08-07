package org.example.oops;

import java.util.Scanner;

public class SortingNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        String[] input = scanner.nextLine().trim().split("\\s+");
        int size = input.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

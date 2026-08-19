package org.example.dsa;

import java.util.*;

public class ThreeSum {
    List<List<Integer>> threeSum(int[] arr){
        if (arr == null || arr.length < 3)
            return new ArrayList<>();
        //sort the elements
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        //Now fix the first element and find the other  two element
        for (int i = 0; i < arr.length - 2; i++) {
            // find other two element using twoSum approach
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    // Add the set and move to find other triplets
                    result.add(new ArrayList<>(Arrays.asList(arr[i], arr[left], arr[right])));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // need to increase left pointer
                } else {
                    right--;
                }
            }
        }
        return  new ArrayList<>(result);
    }

    public  static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        System.out.println(obj.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}

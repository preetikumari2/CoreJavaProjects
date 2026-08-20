package org.example.dsa;

public class RemoveDublicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void  main(String[] args) {
        RemoveDublicates obj = new RemoveDublicates();
        System.out.println(obj.removeDuplicates(new int[]{1,1,2}));
    }
}

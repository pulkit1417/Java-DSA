package arrays;

import java.util.Arrays;

public class rearrangeBySign {
    public static void main(String[] args) {
        int[] nums = { -1, 2, 3, 4, -3, 5 };
        int n = nums.length;
        int[] positives = new int[n];
        int[] negatives = new int[n];
        int posIndex = 0, negIndex = 0;
        
        for (int num : nums) {
            if (num > 0) {
                positives[posIndex++] = num;
            } else {
                negatives[negIndex++] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = positives[i / 2];
            } else {
                nums[i] = negatives[i / 2];
            }
        }
        System.out.println(Arrays.toString(nums));
        //OPTIMAL on leetcode
    }
}
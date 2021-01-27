//Leetcode problem 1

import java.util.*;

public class two_sum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                output[0] = map.get(complement);
                output[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}

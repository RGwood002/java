
//Leetcode 34
import java.util.*;

public class first_last_position {
    public static void main(String[] args) {
        int[] nums = { 1 };
        int target = 1;

        searchRange(nums, target);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = { -1, -1 };
        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];

            if (temp == target) {
                if (start == -1) { // check if the start position has been detected yet
                    start = i;
                } else { // if tmp has been detected but start is modified it could be the end so change
                         // it
                    end = i;
                }
            }
        }
        if (end == -1 && start != -1) {
            end = start;
        }
        arr[0] = start;
        arr[1] = end;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

import java.util.*;

public class runningSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(running(nums)));
    }

    public static int[] running(int[] nums) {
        int[] run = new int[nums.length];
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
            run[i] = num;
        }

        return run;
    }
}

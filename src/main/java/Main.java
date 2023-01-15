import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static class Solution {
        public static void moveZeroes(int[] nums) {
//            int count1 = 0;
//            int count2 = 0;
//            while (count1 + count2 < nums.length) {
//                if (nums[count1] == 0) {
//                    int t = nums[count1];
//                    for (int j = count1; j < nums.length - 1; j++) {
//                        nums[j] = nums[j + 1];
//                        nums[j + 1] = t;
//                        t = nums[j + 1];
//                    }
//                    count2++;
//                } else {
//                    count1++;
//                }
//            }

            int n = nums.length;
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }
            }

            while (j != n) {
                nums[j] = 0;
                j++;
            }
        }
    }
}

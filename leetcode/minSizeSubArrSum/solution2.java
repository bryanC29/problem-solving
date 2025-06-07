import java.util.Arrays;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int targetSum = prefix[i] + target;
            int bound = Arrays.binarySearch(prefix, i + 1, n + 1, targetSum);

            if (bound < 0) {
                bound = -bound - 1;
            }

            if (bound <= n) {
                minLength = Math.min(minLength, bound - i);
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
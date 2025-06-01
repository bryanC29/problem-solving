class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[nums.length - 1] = true;

        for(int i = nums.length - 2; i >= 0; i--) {
            int farthest = Math.min(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= farthest; j++) {
                if (dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[0];
    }
}
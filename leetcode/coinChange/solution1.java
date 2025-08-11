class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for(int i = 0; i <= amount; i++) {
            for(int amt : coins) {
                if(i - amt >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - amt]);
                }
            }
        }

        if(dp[amount] != amount + 1) {
            return dp[amount];
        }

        return -1;
    }
}
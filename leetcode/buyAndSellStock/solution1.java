class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int max = prices.length - 1;

        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[min] > prices[i]) {
                min = i;
            }
        }

        for(int i = min + 1; i < prices.length; i++) {
            if(prices[max] < prices[i]) {
                max = i;
            }
        }

        int profit = prices[max] - prices[min];

        if(profit < 0) {
            return 0;
        } else {
            return profit;
        }
    }
}
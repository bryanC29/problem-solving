class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
	int j = prices.length - 1;
	int profit = 0;

	while(i < j) {
	    if(prices[i] < prices[j]) {
        	if(profit < (prices[j] - prices[i])) {
	            profit = prices[j] - prices[i];
        	}
	        j--;
	    } else {
        	i++;
	    }
	}


        if(profit < 0) {
            return 0;
        } else {
            return profit;
        }
    }
}
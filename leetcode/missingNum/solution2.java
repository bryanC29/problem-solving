class Solution {
    public int missingNumber(int[] nums) {
        int expSum = 0;
        int actSum = 0;

        for(int i = 0; i < nums.length; i++) {
            expSum += i;
            actSum += nums[i];
        }

        expSum += nums.length;

        return expSum - actSum;
    }
}
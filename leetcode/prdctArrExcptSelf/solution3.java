class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i;
        int n = nums.length;
        int current = 1;
        int[] result = new int[n];

        for(i = 0; i < n; i++) result[i] = 1;

        for(i = 0; i < n; i++) {
            result[i] *= current;
            current *= nums[i];
        }

        current = 1;

        for(i = n - 1; i >= 0; i--) {
            result[i] *= current;
            current *= nums[i];
        }

        return result;
    }
}
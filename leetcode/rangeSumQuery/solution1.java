class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];

        for(int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }

        this.prefixSum = arr;
    }
    
    public int sumRange(int left, int right) {
        if(0 == left) return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }
}

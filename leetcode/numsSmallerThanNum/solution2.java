class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        int n = nums.length;
        int[] res = new int[n];
        Arrays.sort(temp);
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(!mp.containsKey(temp[i])) {
                mp.put(temp[i], i);
            }
        }

        for(int i = 0; i < n; i++) {
            res[i] = mp.get(nums[i]);
        }

        return res;
    }
}
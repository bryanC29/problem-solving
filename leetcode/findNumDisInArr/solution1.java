class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> st = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(!st.contains(nums[i])) {
                st.add(nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(!st.contains(i + 1)) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
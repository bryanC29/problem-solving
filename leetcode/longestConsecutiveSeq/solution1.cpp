class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size() == 0) return 0;
        sort(nums.begin(), nums.end());
        int n = 0,max = 0;
        for(int i = 0;i < nums.size() - 1;i++) {
            if(nums[i] == nums[i+1]) continue;
            if((nums[i+1] - nums[i]) == 1) n++;
            else n = 0;
            if(n > max) max = n;
        }
        return max + 1;
    }
};
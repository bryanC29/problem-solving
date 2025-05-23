/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const idx = {};

    for(let i = 0; i < nums.length; i++) {
        if(target - nums[i] in idx) {
            return [i, idx[target - nums[i]]];
        }
        idx[nums[i]] = i;
    }
};
int removeElement(int* nums, int numsSize, int val) {
    int count = 0;
    for(int i = 0; i < numsSize; i++) {
        if(nums[i] == val) {
            for(int j = i+1; j < numsSize; j++) {
                if(nums[j] != val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    count++;
                    break;
                }
            }
        } else {
            count++;
        }
    }
    return count;
}
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;

        while (left < right) {
            int distance = right - left;
            int barHeight = Math.min(height[left], height[right]);
            water = Math.max(water, distance * barHeight);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return water;
    }
}
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int str = 0;
        int max = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(j < n) {
            int chAtJ = nums[j];

            map.put(chAtJ, map.getOrDefault(chAtJ, 0) + 1);
            str += chAtJ;

            while((j - i + 1) != map.size()) {
                int chAtI = nums[i];

                map.put(chAtI, map.getOrDefault(chAtI, 0) - 1);
                str -= chAtI;

                if(map.get(chAtI) <= 0) {
                    map.remove(chAtI);
                }

                i++;
            }

            max = Math.max(max, str);
            j++;
        }

        return max;
    }
}
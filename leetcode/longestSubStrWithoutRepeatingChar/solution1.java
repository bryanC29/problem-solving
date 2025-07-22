class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int str = 0;
        int max = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while(j < n) {
            char chAtJ = s.charAt(j);

            map.put(chAtJ, map.getOrDefault(chAtJ, 0) + 1);
            str++;

            while((j - i + 1) != map.size()) {
                char chAtI = s.charAt(i);

                map.put(chAtI, map.getOrDefault(chAtI, 0) - 1);
                str--;

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
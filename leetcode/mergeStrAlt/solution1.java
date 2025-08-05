class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i = 0;
        int j = 0;
        String res = "";

        while(i < n && j < m) {
            res += word1.charAt(i++);
            res += word2.charAt(j++);
        }

        while(i < n) {
            res += word1.charAt(i++);
        }

        while(j < m) {
            res += word2.charAt(j++);
        }

        return res;
    }
}
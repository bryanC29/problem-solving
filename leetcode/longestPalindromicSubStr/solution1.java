class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;

        String res = s.substring(0, 1);

        for(int i = 0; i < s.length(); i++) {
            String oddStr = expandPalindrome(s, i, i);
            String evenStr = expandPalindrome(s, i, i + 1);

            if(res.length() < oddStr.length()) res = oddStr;
            if(res.length() < evenStr.length()) res = evenStr;
        }

        return res;
    }

    private String expandPalindrome(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}
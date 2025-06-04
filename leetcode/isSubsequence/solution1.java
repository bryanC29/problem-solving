class Solution {
    public boolean isSubsequence(String s, String t) {
        int counter = s.length() - 1;
        for(int i = t.length() - 1; i >= 0; i--) {
            if(counter < 0) {
                return true;
            }
            if(t.charAt(i) == s.charAt(counter)) {
                counter--;
            }
        }

        if(counter < 0) {
            return true;
        }

        return false;
    }
}
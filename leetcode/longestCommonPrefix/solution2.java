class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = getCommonPrefix(prefix, strs[i]);
            if (prefix.equals("")) break;
        }

        return prefix;
    }

    private String getCommonPrefix(String a, String b) {
        int i = 0;
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        return a.substring(0, i);
    }
}
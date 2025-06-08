class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            minLen = Math.min(minLen, s.length());
        }

        int low = 0;
        int high = minLen;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isCommonPrefix(strs, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String prefix = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < len; j++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != prefix.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
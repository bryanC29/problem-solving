class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        String[] res = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            res[i] = "";
        }

        int pos = 0;
        int flow = 1;

        for (int i = 0; i < s.length(); i++) {
            res[pos] += s.charAt(i);

            if (pos == 0) flow = 1;
            else if (pos == numRows - 1) flow = -1;

            pos += flow;
        }

        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += res[i];
        }

        return result;
    }
}

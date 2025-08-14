class Solution {
    public List<String> letterCasePermutation(String s) {
        int n = s.length();
        List<String> res = new ArrayList<>();
        res.add("");

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            List<String> temp = new ArrayList<>();

            if(Character.isAlphabetic(ch)) {
                for(String part : res) {
                    temp.add(part + Character.toLowerCase(ch));
                    temp.add(part + Character.toUpperCase(ch));
                }
            } else {
                for(String part : res) {
                    temp.add(part + Character.toString(ch));
                }
            }

            res = temp;
        }

        return res;
    }
}
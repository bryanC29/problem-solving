class Solution {
    private static Map<Character, String> map = new HashMap<>();
    private static List<String> res = new ArrayList<>();
    private String digits;

    private void initiator() {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        return;
    }

    private void backTrack(StringBuilder ans, int index) {
        if (digits.length() <= index) {
            res.add(ans.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));

        for (int i = 0; i < letters.length(); i++) {
            ans.append(letters.charAt(i));
            backTrack(ans, index + 1);
            ans.deleteCharAt(ans.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        res.clear();
        if(digits == null || digits.isEmpty()) return res;

        this.digits = digits;

        initiator();
        backTrack(new StringBuilder(), 0);

        return res;
    }
}
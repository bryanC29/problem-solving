class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        for(char c : magazine.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()) {
            if(!charMap.containsKey(c) || charMap.get(c) <= 0) {
                return false;
            }
            charMap.put(c, charMap.getOrDefault(c, 0) - 1);
        }

        return true;
    }
}
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth)
                    break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder line = new StringBuilder();
            int wordCount = last - index;
            int spaceSlots = wordCount - 1;

            if (last == words.length || spaceSlots == 0) {
                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1)
                        line.append(" ");
                }

                int remaining = maxWidth - line.length();
                while (remaining-- > 0)
                    line.append(" ");
            } else {
                int totalSpaces = maxWidth - totalChars + spaceSlots;
                int spacePerSlot = totalSpaces / spaceSlots;
                int extra = totalSpaces % spaceSlots;

                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        int spacesToApply = spacePerSlot + (extra-- > 0 ? 1 : 0);
                        for (int s = 0; s < spacesToApply; s++) {
                            line.append(" ");
                        }
                    }
                }
            }

            result.add(line.toString());
            index = last;
        }

        return result;
    }
}
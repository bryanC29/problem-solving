class Solution {
    public String reverseWords(String s) {
        char[] st = s.toCharArray();
        char[] arr = new char[st.length];

        int idx = reverseHelper(st, arr, 0);
        return new String(arr, 0, idx);
    }

    private int reverseHelper(char[] st, char[] arr, int start){
        while(start<st.length && st[start]==' ')
            start++;
        
        int end = start;
        while(end<st.length && st[end]!=' ')
            end++;

        if(start-end==0)
            return 0;

        int reversedLen = reverseHelper(st, arr, end);

        if(reversedLen!=0)
            arr[reversedLen++] = ' ';

        while(start<end){
            arr[reversedLen++] = st[start++];
        }
        return reversedLen;
    }
}
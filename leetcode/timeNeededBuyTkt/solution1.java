class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int count = 0;
        int i = 0;

        while(true) {

            if(tickets[i] > 0) {
                tickets[i]--;
                count++;

                if(i == k && tickets[i] == 0) {
                    return count;
                }
            }

            i = (i + 1) % n;
        }
    }
}
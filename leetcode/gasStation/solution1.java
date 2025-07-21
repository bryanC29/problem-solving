class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int currGas = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            currGas += diff;

            if(currGas < 0) {
                start = i + 1;
                currGas = 0;
            }
        }

        if(total < 0) return -1;

        return start;
    }
}
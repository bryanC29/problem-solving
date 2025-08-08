class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n = senate.length();
        
        for(int i = 0;i < n;i++){
            if(senate.charAt(i) == 'R') rad.add(i);
            else dir.add(i);
        }
        
        while(!rad.isEmpty() && !dir.isEmpty()){
            int r = rad.poll();
            int d = dir.poll();
            
            if(r < d) rad.add(r + n);
            else dir.add(d + n);
        }

        return rad.size() > dir.size() ? "Radiant" : "Dire";
    }
}
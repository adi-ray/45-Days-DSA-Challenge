class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        if(n == 0)
            return ans;
            
        // ans[0] = 0 (by default)
        ans[1] = 1;
        
        for(int i = 2; i < n+1; i++) {       
            if(i%2 == 0) {
                ans[i] = ans[i/2];
            } else {
                ans[i] = ans[i/2] + 1;
            }            
        }
        
        return ans;
    }
}
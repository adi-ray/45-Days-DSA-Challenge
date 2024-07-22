// User function Template for Java

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i < n; i++) {
            if(a[i] + b[n - 1-i] < k) {
                return false;
            }
        }
        
        return true;
    }
}
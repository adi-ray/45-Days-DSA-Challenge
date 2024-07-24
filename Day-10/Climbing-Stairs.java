class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[46];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=45;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        return arr[n];
    }
}
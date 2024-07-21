class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        
        // Initialize two pointers
        int i = 0, j = 1;
        
        while (i < n && j < n) {
            int diff = arr[j] - arr[i];
            
            if (diff == x && i != j) {
                return 1;
            } else if (diff < x) {
                j++;
            } else {
                i++;
            }
        }
        
        return -1;
    }
}
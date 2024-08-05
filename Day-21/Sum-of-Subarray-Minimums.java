class Solution {
    public int sumSubarrayMins(int[] arr) {
        long res = 0;
        Stack<Integer> st = new Stack<>();
        long MOD = (long) 1e9 + 7;
        st.push(-1);

        for (int i = 0; i < arr.length+1; i++){
            int val = (i<arr.length)? arr[i] : 0;
            
            while(st.peek() !=-1 && val < arr[st.peek()]){
                int k = st.pop();
                int j = st.peek();
                int left = k - j; // pse
                int right = i - k; // nse
                res = (long) (res + (left * right * (long) arr[k]) % MOD) % MOD;
            }           
            st.push(i);          
        }
        
        return (int) res;
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                int element = st.pop();           
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();

                int ht = heights[element];
                int wd = nse - pse - 1;
                maxArea = Math.max(ht*wd, maxArea);
            }
            st.push(i);
        }

        while(!st.isEmpty()) {
            int nse = n;
            int element = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();

            int ht = heights[element];
            int wd = nse - pse - 1;
            maxArea = Math.max(ht*wd, maxArea);
        }

        return maxArea;
    }
}
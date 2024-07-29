class Solution {  
    // max area of a histogram
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

    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int maxArea = 0;
        int height[] = new int[n];

        // creating histogram
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j]=='1')
                    height[j]++;
                else
                    height[j]=0;
            }
            // calculating max area for each row
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }

        return maxArea;
    }
}
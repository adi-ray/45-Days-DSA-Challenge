class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m - 1, top = 0, bottom = n - 1;

        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++) {
                res.add(matrix[top][j]);
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                res.add(matrix[j][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    res.add(matrix[bottom][j]);
                }
            }
            bottom--;

            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    res.add(matrix[j][left]);
                }
            }
            left++;
        }

        return res;
    }
}
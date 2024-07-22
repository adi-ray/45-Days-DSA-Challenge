class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = nums[n/2];
        int cnt = 0;

        for(int i=0; i<n; i++) {
            cnt += Math.abs(nums[i]-mid);
        }

        return cnt;
    }
}
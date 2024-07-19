class Solution {
    public boolean canJump(int[] nums) {
        int maxIndx = 0;

        for(int i=0; i<nums.length; i++) {
            if(i > maxIndx) {
                return false;
            }
            // Update the maximum index that can be reached
            // Compare the current maxIndex with current index + maximum jump from that index
            maxIndx = Math.max(maxIndx, i+nums[i]);
            // maxIndex reached/crossed the last index
            if(maxIndx >= nums.length - 1) {
                return true;
            }
        }
        // completion of loop implies reached last index    
        return true;
    }
}
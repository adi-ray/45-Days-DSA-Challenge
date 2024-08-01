class Solution {
    private int countPartitions(int[] arr, int maxSum) {
        int partitions = 1;
        int subarraySum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(subarraySum + arr[i] <= maxSum) {
                // insert element to current subarray
                subarraySum += arr[i];
            } else {
                // insert element to next subarray
                partitions += 1;
                subarraySum = arr[i];
            }
        }
        
        return partitions;
    }
    
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;
        
        // low=maximum & high=sum
        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        
        // Binary Search
        while(low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(nums, mid);
            if(partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
}
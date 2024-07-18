class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); // Setting 0 in the map
        
        int preSum = 0;
        int cnt = 0;

        for(int i=0;i<nums.length;i++) {
            preSum += nums[i];
    
            int remove = preSum - k;
            // Add the number of subarrays to be removed:
            cnt += map.getOrDefault(remove, 0);
            // Update the count of prefix sum in the map.
            map.put(preSum, map.getOrDefault(preSum,0) + 1);
        }

        return cnt;
    }
}
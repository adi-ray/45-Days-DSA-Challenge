class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); // Setting 0 in the map

        int preSum=  0;
        int cnt = 0;

        for(int i=0; i<nums.length; i++){
            preSum += nums[i];
            int rem = preSum % k;
            if(rem < 0){
                rem = rem + k;
            }
            // Add the number of subarrays to be removed:
            cnt += map.getOrDefault(rem, 0);
            // Update the count of remainder in the map.
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return cnt;
    }
}
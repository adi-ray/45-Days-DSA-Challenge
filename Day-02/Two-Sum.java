class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int val = nums[i];
            int req = target - nums[i];

            if(map.containsKey(req)) {
                return new int[] {i, map.get(req)};
            }
            map.put(val, i);
        }

        return new int[] {};
    }
}
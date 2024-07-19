class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        List<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int num = Math.abs(nums[i]);

            if(nums[num - 1] < 0) {
                res.add(num);
            } else {
                nums[num - 1] *= -1;
            }
        }

        return res;
    }
}
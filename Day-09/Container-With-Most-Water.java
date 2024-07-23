class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while(lp != rp) {
            int ht = Math.min(height[lp] , height[rp]);
            int wd = rp - lp;
            int currWater = ht * wd;
            maxWater = Math.max(currWater, maxWater);

            if(height[lp] < height[rp])
                lp++;
            else
                rp--;
        }

        return maxWater;
    }
}
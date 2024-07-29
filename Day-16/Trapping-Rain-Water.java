class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trappedWater = 0;

        int l = 0, r = n-1;
        int lmax = 0, rmax = 0;

        while(l <= r) {
            if(height[l] <= height[r]) {
                if(lmax >= height[l])       
                    trappedWater += lmax - height[l];
                else 
                    lmax = height[l];
                l++;
            } else {
                if(rmax >= height[r])       
                    trappedWater += rmax - height[r];
                else 
                    rmax = height[r];
                r--;
            }
        }

        return trappedWater;
    }
}
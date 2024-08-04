class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int cnt = 0;
        int arr[] = nums.clone();
        Arrays.sort(arr);
    
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            map.put(arr[i],i);
        }
        
        for(int i = 0 ; i < nums.length; i++) {
            while(map.get(nums[i]) != i) {
                cnt++;
                int temp = nums[i];
                nums[i] = nums[map.get(temp)];
                nums[map.get(temp)] = temp;
            }
        
        }
        
        return cnt;
    }
}
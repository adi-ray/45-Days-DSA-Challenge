//User function Template for Java
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = m-1;
        
        while(j < n) {
            int diff = a.get(j)-a.get(i);
            min = Math.min(min,diff);
            i++;
            j++;
        }
        
        return min;
    }
}
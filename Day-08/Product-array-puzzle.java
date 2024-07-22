//User function Template for Java

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long product[] = new long[n];

        long prefix = 1;
        for (int i = 0; i < n; i++) {
            product[i] = prefix;
            prefix *= nums[i];
        }

        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            product[i] *= suffix;
            suffix *= nums[i];
        }

        return product;
	} 
} 
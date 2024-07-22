class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        boolean contains1 = false;
        for(int i=0; i<size; i++) {
            if(arr[i] == 1) {
                contains1 = true;
            }
            if(arr[i] <=0 || arr[i] > size) {
                arr[i] = 1;
            }
        }
        
        if(!contains1) return 1;
        
        for (int i = 0; i < size; i++) {
            int val = Math.abs(arr[i]);
            int idx = val - 1;

            if (arr[idx] < 0) 
                continue;
            arr[idx] *= -1;
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] > 0)
                return i + 1;
        }

        return size + 1;
    }
}
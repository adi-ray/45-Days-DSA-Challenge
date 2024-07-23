//User function Template for Java

class Solution {
    static void generatePermutations(ArrayList<Integer> arr, int n, ArrayList<Integer> ds, boolean[] used, ArrayList<ArrayList<Integer>> ans) {
        if (ds.size() == n) {
            ans.add(new ArrayList<>(ds));
            return;
        }
    
        for (int i = 0; i < n; i++) {
            // skipping duplicates
            if (used[i] || (i > 0 && arr.get(i) == arr.get(i - 1) && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            ds.add(arr.get(i));
            generatePermutations(arr, n, ds, used, ans);
            ds.remove(ds.size() - 1);
            used[i] = false;
        }
    }
    
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>(); 
        boolean freq[] = new boolean[n]; 
        
        Collections.sort(arr);
        generatePermutations(arr, n, ds, freq, ans);
        
        return ans; 
    }
};
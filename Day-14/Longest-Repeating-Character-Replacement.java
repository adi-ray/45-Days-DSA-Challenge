class Solution {
    public int characterReplacement(String s, int k) {
        int hash[] = new int[26];
        int l = 0, r = 0, maxlen = 0, maxf = 0;
        
        while(r < s.length()) {
            hash[s.charAt(r) - 'A']++;
            // get the largest count of a single, unique character in the current window
            maxf = Math.max(maxf, hash[s.charAt(r) - 'A']);
        
            if((r - l + 1) - maxf > k) {     
                hash[s.charAt(l) - 'A']--;
                l++;
            }
            // maximum length of repeating character
            maxlen = Math.max(maxlen, r - l + 1);  
            r++;
        }

        return maxlen;      
    }
}
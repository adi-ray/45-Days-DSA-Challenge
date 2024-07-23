class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        String ans = "";

        while(i>=0){
            //ignore the trailing space of String
            while(i>=0 && s.charAt(i) == ' ') i--;
            
            // handle the leading space of String
            if(i<0) break;

            int j = i;
            
            while(i>=0 && s.charAt(i) != ' ') i--;

            if(ans == ""){
                ans=ans.concat(s.substring(i+1,j+1));
            }else{
                ans=ans.concat(' '+s.substring(i+1,j+1));
            }
        }

        return ans;
    }
}
class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> st = new Stack<>();
        for(String s: str) {
            if(s.equals("..")) {
                if(!st.isEmpty()) {
                        st.pop();
                    }
            } else if(!s.equals(".") && !s.equals("")) {
                    st.push(s); 
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String s :st){
            sb.append("/").append(s);
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}
class Solution {
    private String buildString(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }

        return String.valueOf(st);
    }

    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
}
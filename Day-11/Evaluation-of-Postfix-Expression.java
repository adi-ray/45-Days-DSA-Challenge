class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isDigit(ch)) {
                st.push(ch - '0'); // Convert char to int
            } else {
                int val1 = st.pop();
                int val2 = st.pop();

                switch (ch) {
                    case '+':
                        st.push(val2 + val1);
                        break;
                    case '-':
                        st.push(val2 - val1);
                        break;
                    case '*':
                        st.push(val2 * val1);
                        break;
                    case '/':
                        st.push(val2 / val1);
                        break;
                }
            }
        }
        
        return st.pop();
    }
}
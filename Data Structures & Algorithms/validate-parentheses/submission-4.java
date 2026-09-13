class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ']' || c == '}' || c == ')') {
                if (st.isEmpty()) {
                    return false;
                }
                char o = st.pop();
                if ((o == '[' && c != ']') || (o == '{' && c != '}') || (o == '(' && c != ')')) {
                    return false;
                }
            } else {
                st.push(c);
            }
        }

        return st.isEmpty();
    }
}

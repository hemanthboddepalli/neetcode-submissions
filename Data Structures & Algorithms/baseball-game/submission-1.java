class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s : operations) {
            if (s.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                int c = a + b;
                st.push(b);
                st.push(a);
                st.push(c);
            } else if (s.equals("C")) {
                st.pop();
            } else if (s.equals("D")) {
                int d = 2 * st.peek();
                st.push(d);
            } else {
                st.push(Integer.parseInt(s));
            }
        }

        int res = 0;
        for (int value : st) {
            res += value;
        }

        return res;
    }
}

// "5","-2","4","C","D","9","+","+"

// [5, -4, 9, ]
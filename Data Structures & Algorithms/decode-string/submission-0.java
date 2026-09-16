class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == ']') {
                StringBuilder string = new StringBuilder();
                while (!st.isEmpty() && Character.isLetter(st.peek().charAt(0))) {
                    string.insert(0, st.pop());
                }

                st.pop();

                StringBuilder number = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
                    number.insert(0, st.pop());
                }

                StringBuilder finalString = new StringBuilder();
                for (int j = 0; j < Integer.parseInt(number.toString()); j++) {
                    finalString.append(string.toString());
                }

                st.push(finalString.toString());
            } else {
                st.push(String.valueOf(c));
            }
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for (String str : st) {
            sb.append(str);
        }

        return sb.toString();
    }
}
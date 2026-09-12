class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int num : asteroids) {
            boolean pushRequired = true;
            while (!st.isEmpty() && st.peek() > 0 && pushRequired && num < 0) {
                if (st.peek() < Math.abs(num)) {
                    st.pop();
                } else if (st.peek() > Math.abs(num)) {
                    pushRequired = false;
                } else {
                    st.pop();
                    pushRequired = false;
                }
            }

            if (pushRequired) {
                st.push(num);
            }
        }

        return st.stream().mapToInt(Integer::intValue).toArray();
    }
}
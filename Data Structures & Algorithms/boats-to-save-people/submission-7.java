class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                res++;
                left++;
                right--;
            } else if (people[left] + people[right] > limit) {
                right--;
                res++;
            }
        }

        return res;
    }
}
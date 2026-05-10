class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0, left = 0, right = people.length - 1;
        while (left < right) {
            right--;
            boats++;
            if (people[left] + people[right + 1] <= limit) {
                left++;
            }
        }
        if (left == right) boats++;
        return boats;
    }
}
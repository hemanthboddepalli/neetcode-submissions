class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for (String str: strs) {
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedString = String.valueOf(strArray);

            hm.put(sortedString, hm.getOrDefault(sortedString, new ArrayList<>()));
            hm.get(sortedString).add(str);
        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> subRes : hm.values()) {
            res.add(subRes);
        }

        return res;
    }
}

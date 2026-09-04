class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for (String str : strs) {
            char[] strChars = str.toCharArray();
            Arrays.sort(strChars);
            String sortString = Arrays.toString(strChars);
            if (!hm.containsKey(sortString)) {
                hm.put(sortString, new ArrayList<>());
            }
            hm.get(sortString).add(str);
        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> subRes : hm.values()) {
            res.add(subRes);
        }

        return res;
    }
}

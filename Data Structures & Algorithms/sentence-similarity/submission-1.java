class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) {
            return false;
        }

        Map<String, Set<String>> similarMap = new HashMap<>();
        for (List<String> pair : similarPairs) {
            similarMap.computeIfAbsent(pair.get(0), value -> new HashSet<>()).add(pair.get(1));
            similarMap.computeIfAbsent(pair.get(1), value -> new HashSet<>()).add(pair.get(0));
        }

        for (int i = 0; i < sentence1.length; i++) {
            if (sentence1[i].equals(sentence2[i])) {
                continue;
            }

            if (similarMap.containsKey(sentence1[i]) && similarMap.get(sentence1[i]).contains(sentence2[i])) {
                continue;
            }

            return false;
        }

        return true;
    }
}

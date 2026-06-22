class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();

        for(String s : strs) {
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            map.putIfAbsent(sortedWord, new ArrayList());
            map.get(sortedWord).add(s);
        }

        return new ArrayList(map.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupAnagram = new HashMap();

        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            groupAnagram.putIfAbsent(sortedWord, new ArrayList<>());
            groupAnagram.get(sortedWord).add(s);
        }
        
        return groupAnagram.values()
                .stream()
                .toList();
    }
}

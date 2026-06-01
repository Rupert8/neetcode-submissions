class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int right = 0;

        int max = 0;
        char[] charS = s.toCharArray();
        Set<Character> distinctSubString = new HashSet();

        while(right < s.length()) {
            if(distinctSubString.contains(charS[right])) {
                distinctSubString.remove(charS[left]);
                left++;
            } else {
                distinctSubString.add(charS[right]);
                max = Math.max(max, right - left + 1);
                right++;
            }
        }
        return max;
    }
}

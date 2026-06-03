class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> windowCount = new HashMap();
        Map<Character, Integer> tCount = new HashMap();

        for(Character letter : t.toCharArray()) {
            tCount.put(letter, tCount.getOrDefault(letter, 0) + 1);
        } 

        int right = 0;
        int left = 0;

        int needed = tCount.size();
        int have = 0;
     
        char[] sArray = s.toCharArray();

        int startIndex = 0;
        int minLength = Integer.MAX_VALUE;
        while(right < s.length()) {
            Character rightIndex = s.charAt(right);
            windowCount.put(rightIndex, windowCount.getOrDefault(rightIndex, 0) + 1);

            if(tCount.containsKey(rightIndex) && windowCount.get(rightIndex).equals(tCount.get(rightIndex))) {
                have++;
            };

            while(have == needed) {
                int currentWindowLength = right - left + 1;
                if(currentWindowLength < minLength) {
                    minLength = currentWindowLength;
                    startIndex = left;
                }

                Character leftIndex = s.charAt(left);
                windowCount.put(leftIndex, windowCount.getOrDefault(leftIndex, 0) - 1);

                if(tCount.containsKey(leftIndex) && windowCount.get(leftIndex) < tCount.get(leftIndex)) {
                    have--;
                }

                left++;
            }
            
            right++;
        }

        if(minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLength);
    }
}

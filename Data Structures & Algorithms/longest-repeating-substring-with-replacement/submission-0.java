class Solution {
    public int characterReplacement(String s, int k) {
        int[] letterCount = new int[26];

        int left = 0;
        int right = left;

        int maxFrequency = 0;
        int maxLength = 0;
        char[] charS = s.toCharArray();
        while(right < s.length()) {
            int rightIndex = s.charAt(right) - 'A';
            letterCount[rightIndex]++;

            maxFrequency = Math.max(maxFrequency, letterCount[rightIndex]);

            if((right - left + 1) - maxFrequency > k) {
                int leftIndex = s.charAt(left) - 'A';
                letterCount[leftIndex]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}

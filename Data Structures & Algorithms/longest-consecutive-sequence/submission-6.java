class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;

        Set setNumbers = new HashSet();
        for(int num : nums) {
            setNumbers.add(num);
        }

        for(int num : nums) {
            int streak = 0; 
            int curr = num;
            while(setNumbers.contains(curr)) {
                streak++;
                curr++;
            }
            result = Math.max(result, streak);
        }
        return result;
    }
}

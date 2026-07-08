class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dubMap = new HashMap<>();
        
        for(int num : nums) {
            if(dubMap.containsKey(num)) {
                return true;
            }

            dubMap.put(num, 1);
        }

        return false;
    }
}
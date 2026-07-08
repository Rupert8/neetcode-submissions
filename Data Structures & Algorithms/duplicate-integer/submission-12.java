class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dubSet = new HashSet<>(nums.length);

        for(int i = 0; i < nums.length; i++) {
            if(!dubSet.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
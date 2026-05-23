class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet result = new HashSet();

        for (int i=0; i<nums.length; i++) {
            result.add(nums[i]);
        }

        if(result.size() != nums.length) return true;
        return false;
    }
}
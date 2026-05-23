class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length;

        for(int i = 0; i < length; i++) {
            int copy = 0;
            for(int j = 0; j < length; j++) {
                if(nums[i] == nums[j]) {
                    copy++;
                }
            }
            if(copy > 1) {
            return true;
        }
        }
        

        return false;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            sumMap.put(nums[i], i);
        }

        for(int i = 0; i < sumMap.size(); i++) {
            int diff = target - nums[i];
            if(sumMap.containsKey(diff) && sumMap.get(diff) != i) {
                return new int[] {i, sumMap.get(diff)};
            }
        }

        return null;
    }
}

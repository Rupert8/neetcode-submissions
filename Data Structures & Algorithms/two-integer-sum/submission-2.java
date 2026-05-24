class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbersMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            numbersMap.put(nums[i], i);
        } 

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numbersMap.containsKey(diff) && numbersMap.get(diff) != i) {
                return new int[]{i, numbersMap.get(diff)};
            }
        }
        return new int[0];
    }
}

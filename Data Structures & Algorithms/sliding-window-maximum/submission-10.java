class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length < k && nums.length - k < 0) {
            return new int[0];
        }

        List<Integer> listNumbers = new ArrayList();

        int left = 0;
        int right = k;

        while(right <= nums.length){
            int[] slideNums;
            if(left > right) {
                slideNums = Arrays.copyOf(nums, nums.length);
            } else {
                slideNums =  Arrays.copyOfRange(nums, left, right);
            }
            int max = Integer.MIN_VALUE;
            
            for(int i = 0;i < slideNums.length; i++) {
                if(slideNums[i] > max) {
                    max = slideNums[i];
                }
            }

            listNumbers.add(max);

            left++;
            right++;
        }

        int[] result = listNumbers.stream()
                                    .mapToInt(Integer::intValue)
                                    .toArray();
        return result;
    }
}

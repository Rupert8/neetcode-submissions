class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> multipliedNumbers = new ArrayList();

        for(int i = 0; i < nums.length; i++) {
            int temp = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    temp = temp * nums[j];
                }              
            }
            multipliedNumbers.add(temp);
        }

        int[] result = multipliedNumbers.stream()
                                        .mapToInt(Integer::intValue)
                                        .toArray();
        return result;
        }
}  

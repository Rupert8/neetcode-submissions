class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> countList = new ArrayList();
        for(Map.Entry<Integer, Integer> value : count.entrySet()) {
            countList.add(new int[] {value.getValue(), value.getKey()});
        }

        countList.sort((a, b) ->  b[0] - a[0]);

        int[] result = new int[k];
        for(int i = 0; i < result.length; i++) {
            result[i] = countList.get(i)[1];
        }

        return result;
    }
}

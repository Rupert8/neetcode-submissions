class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> carsProperty = new TreeMap(Comparator.reverseOrder());
        Deque<Double> stack = new ArrayDeque();

        for(int i = 0; i < position.length; i++) {
            double timeToFinish = (double)(target-position[i])/speed[i];
            carsProperty.put(position[i], timeToFinish);
        } 

        for(double currentTime : carsProperty.values()) {
            if(stack.isEmpty() || currentTime > stack.peek()) {
                stack.push(currentTime);
            }
        }
        
        return stack.size();
    }
}
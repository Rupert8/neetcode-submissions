class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque();

        for(String s : tokens) {
            if(s.matches("-?\\d+")) {
                stack.push(Integer.parseInt(s));
            } else {
                int left = stack.pop();
                int right = stack.pop();
                int sum = 0;

                if(s.equals("+")) {
                    sum = left + right; 
                } else if (s.equals("*")) {
                    sum = left * right;
                } else if (s.equals("-")) {
                    sum = right - left;
                } else if (s.equals("/")) {
                    sum = right / left;
                }

                stack.push(sum);
            }
        }

        return stack.pop();
    }
}

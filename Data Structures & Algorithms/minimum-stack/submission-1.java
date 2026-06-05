class MinStack {
    private Node node;

    private static class Node {
        private int val;
        private int min;
        private Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    public MinStack() {
        this.node = null;
    }
    
    public void push(int val) {
        if(node == null) {
            node = new Node(val, val, null);
        } else {
            int currentMin = Math.min(val, node.min);
            node = new Node(val, currentMin, node);
        }
    }
    
    public void pop() {
        if(node != null) {
            node = node.next;
        }
    }
    
    public int top() {
        return node.val;
    }
    
    public int getMin() {
        return node.min;
    }
}

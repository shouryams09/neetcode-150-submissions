class MinStack {
    Deque<Integer> deque;
    Stack<Integer> minStack;
    Integer min=null;
    public MinStack() {
        this.deque=new ArrayDeque<>();
        this.minStack=new Stack<>();
    }
    
    public void push(int val) {
        deque.addFirst(val);
        if(min==null){
            min=val;
        }else{
            min=Math.min(min,val);
        }
        minStack.push(min);
    }
    
    public void pop() {
        if(deque.isEmpty()) return;
        deque.removeFirst();
        minStack.pop();
       if (minStack.isEmpty()) {
            min = null;
        } else {
            min = minStack.peek();
        }
    }
    
    public int top() {
       return deque.getFirst();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

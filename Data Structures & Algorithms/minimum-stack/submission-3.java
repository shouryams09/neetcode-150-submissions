class MinStack {
    Stack<Integer>s;
    Stack<Integer>minStack;
    public MinStack() {
        this.s=new Stack<>();
        this.minStack=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        if (s.isEmpty()) {
            return;
        }
        
        minStack.pop();
        s.pop();  
    }
    
    public int top() {
        if (s.isEmpty()) {
            return -1;
        }
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

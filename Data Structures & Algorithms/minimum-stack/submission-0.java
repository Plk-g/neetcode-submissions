class MinStack {
    Stack <Integer> max = new Stack<>();
    Stack <Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if (max.empty()){
            max.push(val);
            min.push(val);
        } else{
            max.push(val);
            min.push(Math.min(val, min.peek()));
        }
        
    }
    
    public void pop() {
        max.pop();
        min.pop();
        
    }
    
    public int top() {
        return max.peek();
        
    }
    
    public int getMin() {
        return min.peek();
    }
}

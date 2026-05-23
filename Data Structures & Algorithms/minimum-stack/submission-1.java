class MinStack {
    List<Integer> stack;
    Stack<Integer> mins;

    public MinStack() {
        stack = new ArrayList<>();
        mins = new Stack<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(mins.isEmpty()||mins.peek()>=val){
            mins.push(val);
        }
    }
    
    public void pop() {
        if(top()==mins.peek()){
            mins.pop();
        }
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return mins.peek();
    }
}

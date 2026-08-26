class MinStack {

    public MinStack() {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> minst=new Stack<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        val = Math.min(val,!minst.isEmpty()? minst.peek():val);
        minst.push(val);
    }
    
    public void pop() {
        st.pop();
        minst.pop();
        
    }
    
    public int top() {
        st.peek();
        
    }
    
    public int getMin() {
        minst.peek();
    }
}

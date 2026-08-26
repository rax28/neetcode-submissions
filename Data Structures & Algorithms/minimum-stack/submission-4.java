class MinStack {
   private Stack<Integer> st;
    private Stack<Integer> minst;
    public MinStack() {
        st = new Stack<>();
        minst=new Stack<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        val = Math.min(val,!minst.isEmpty()? minst.peek():val);
        minst.push(val);
    }
    
    public void pop() {
       if(st.isEmpty()) return
       int top=st.pop();
        if(top==minst.peek())
        {
            minst.pop();
        }
        
    }
    
    public int top() {
     return st.peek();
        
    }
    
    public int getMin() {
       return minst.peek();
    }
}

class MyQueue {
    private Stack<Integer> A;
    private Stack<Integer> B;
    public MyQueue() {
        A=new Stack<>();
        B=new Stack<>();
    }
    
    public void push(int x) {
        A.push(x);
    }
    
    public int pop() {
        if(B.isEmpty())
        {
            while(!A.isEmpty())
            {
                B.push(A.pop());
            }
        }
        return B.pop();
    }
    
    public int peek() {
        if(B.isEmpty())
        {
            while(!A.isEmpty())
            {
                B.push(A.pop());
            }
        }
        return B.peek();
    }
    
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}

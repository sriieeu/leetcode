class MyQueue {
    Queue<Integer> a = new LinkedList<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(a.isEmpty()){
            a.offer(x);
        }
        else{
            a.offer(x);
            int n = a.size();
            for(int i = 0 ; i< n;i++){
                a.offer(a.poll());
            }
        }
    }
    
    public int pop() {
        return a.remove();
    }
    
    public int peek() {
        return a.peek();
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
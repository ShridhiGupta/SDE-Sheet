import java.util.*;

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        int s = q.size();
        for(int i = 0; i < s - 1; i++) {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.top()); 
        System.out.println(obj.pop()); 
        System.out.println(obj.top()); 
        System.out.println(obj.empty());
    }
}

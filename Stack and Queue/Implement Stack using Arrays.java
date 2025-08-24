class MyStack {

    int size = 1000;       
    int[] arr = new int[size];
    int top = -1; 

    public void push(int x) {
        if (top < size - 1) {
            top += 1;
            arr[top] = x;
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int ele = arr[top];
        top -= 1;
        return ele;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Get size of stack
    public int getSize() {
        return top + 1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop()); 
        System.out.println("Top element after pop: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Popped: " + stack.pop());
    }
}

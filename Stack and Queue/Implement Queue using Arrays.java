class MyQueue {

    int front, rear;
    int size = 100005;   
    int arr[];

    MyQueue() {
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        if (rear == size) {
            System.out.println("Queue Overflow!");
            return;
        }
        arr[rear] = x;
        rear++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if (front == rear) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int ele = arr[front];
        front++;
        return ele;
    }

    int peek() {
        if (front == rear) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return front == rear;
    }

    int getSize() {
        return rear - front;
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front element is: " + q.peek());
        System.out.println("Popped element is: " + q.pop());
        System.out.println("Front element after pop: " + q.peek());

        while (!q.isEmpty()) {
            System.out.println("Popped: " + q.pop());
        }

        System.out.println("Popped: " + q.pop()); // -1
    }
}

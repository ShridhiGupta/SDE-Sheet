import java.util.*; 
import java.io.*; 

public class Solution {

    private static void insert(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insert(stack, temp);
        stack.push(val);
    }

    public static void sortStack(Stack<Integer> stack) {
        if (stack.size() <= 1) return;
        int temp = stack.pop();
        sortStack(stack);
        insert(stack, temp);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        System.out.println("Original stack: " + st);
        sortStack(st);
        System.out.println("Sorted stack: " + st);
    }
}

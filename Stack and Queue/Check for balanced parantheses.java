import java.util.*;

class Solution {
    private boolean checkPair(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty() || !checkPair(st.peek(), ch)) 
                    return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isValid("()"));  
        System.out.println(sol.isValid("()[]{}"));
        System.out.println(sol.isValid("(]"));   
        System.out.println(sol.isValid("([)]"));  
        System.out.println(sol.isValid("{[]}"));
    }
}

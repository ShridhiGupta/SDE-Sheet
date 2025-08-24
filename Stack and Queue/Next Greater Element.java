import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for (int num : nums2) {
            while (!st.isEmpty() && st.peek() < num) {
                map.put(st.pop(), num);
            }
            st.push(num);
        }
        
        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(sol.nextGreaterElement(nums1, nums2)));
    }
}

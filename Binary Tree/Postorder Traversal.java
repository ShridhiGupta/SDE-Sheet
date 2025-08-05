/**
 * Problem: Binary Tree Postorder Traversal
 * Link: https://leetcode.com/problems/binary-tree-postorder-traversal/
 * 
 * Approach: Recursive
 * Time Complexity: O(N)
 * Space Complexity: O(N) - due to recursion stack
 */

import java.util.*;

public class PostorderTraversal {

    static class TreeNode { 
        int val;
        TreeNode left, right;

        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return ans;
    }

    private void postOrder(TreeNode node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        ans.add(node.val);
    }

    // For local testing
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        PostorderTraversal obj = new PostorderTraversal();
        System.out.println("Postorder Traversal: " + obj.postorderTraversal(root)); // Output: [3, 2, 1]
    }
}

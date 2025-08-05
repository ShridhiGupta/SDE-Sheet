/**
 * Problem: Binary Tree Inorder Traversal
 * Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
 * 
 * Approach: Recursive
 * Time Complexity: O(N)
 * Space Complexity: O(N) - due to recursion stack
 */

import java.util.*;

public class InorderTraversal {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);
        ans.add(node.val);
        inOrder(node.right);
    }

    // For local testing
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTraversal obj = new InorderTraversal();
        System.out.println("Inorder Traversal: " + obj.inorderTraversal(root)); // Output: [1, 3, 2]
    }
}

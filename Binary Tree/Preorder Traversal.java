/**
 * Problem: Binary Tree Preorder Traversal
 * Link: https://leetcode.com/problems/binary-tree-preorder-traversal/
 * 
 * Approach: Recursive
 * Time Complexity: O(N)
 * Space Complexity: O(N) - due to recursion stack
 */

import java.util.*;

public class PreorderTraversal {

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

    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return ans;
    }

    private void preOrder(TreeNode node) {
        if (node == null) return;
        
        ans.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    // For local testing
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        PreorderTraversal obj = new PreorderTraversal();
        System.out.println("Preorder Traversal: " + obj.preorderTraversal(root)); // Output: [1, 2, 3]
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private int result = Integer.MIN_VALUE;

    private int diameter(TreeNode root) {
        if (root == null)
            return 0;

        int lh = diameter(root.left);
        int rh = diameter(root.right);
        result = Math.max(result, lh + rh);

        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);

        return result;
    }
}
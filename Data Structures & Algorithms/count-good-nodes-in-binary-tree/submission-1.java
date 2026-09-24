/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, root.val);
    }

    private int goodNodes(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        int maxNode = Math.max(node.val, max);

        int left = goodNodes(node.left, maxNode);
        int right = goodNodes(node.right, maxNode);

        return left + right + (node.val >= max ? 1 : 0);
    }
}

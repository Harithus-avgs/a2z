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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftD = diameterOfBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfD = lh + rh;
        int maxD = Math.max(leftD,rightD);
        return Math.max(maxD,selfD);
    }

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
}
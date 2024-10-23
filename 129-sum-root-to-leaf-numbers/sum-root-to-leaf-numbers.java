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
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
        
    }
    int solve(TreeNode root,int total){
        if(root==null){
            return 0;
        }
        
        total = total*10 + root.val;

        if(root.left==null && root.right==null){
            return total;
        }
        return solve(root.left,total) + solve(root.right,total);
    }
}
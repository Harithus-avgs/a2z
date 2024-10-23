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
    int total=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        solve(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return total;
    }
    void solve(TreeNode root,int sum,long curr){
        if(root == null ) return;
        curr += root.val;
        if(curr == sum){
            total++;
        }
        solve(root.left,sum,curr);
        solve(root.right,sum,curr);

    }
}
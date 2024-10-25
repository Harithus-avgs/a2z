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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int level = 0;
        List<Long> ans = new ArrayList<>();

        while (!q.isEmpty()) {
            int size = q.size();
            long levelSum = 0;
            level++; 

            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.remove();
                levelSum += currNode.val;

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            ans.add(levelSum);
            
        }
        if(k>ans.size()){
            return -1;
        }
        ans.sort(Collections.reverseOrder());
        
     return   ans.get(k-1);
    }
}
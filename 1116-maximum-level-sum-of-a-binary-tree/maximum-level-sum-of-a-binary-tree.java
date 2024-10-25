class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int level = 0;
        int maxSum = Integer.MIN_VALUE;
        int levelWithMaxSum = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;
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
            if (levelSum > maxSum) {
                maxSum = levelSum;
                levelWithMaxSum = level;
            }
        }

        return levelWithMaxSum;
    }
}

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
            level++; // Increase level each time we move to a new level in the tree

            // Process nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.remove();
                levelSum += currNode.val;

                // Add child nodes to the queue for the next level
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

            // Update max sum and level if the current level sum is higher
            if (levelSum > maxSum) {
                maxSum = levelSum;
                levelWithMaxSum = level;
            }
        }

        return levelWithMaxSum;
    }
}

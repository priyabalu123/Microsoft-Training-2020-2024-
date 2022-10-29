class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int rightone = maxDepth(root.right);
        int leftone = maxDepth(root.left);
        return Math.max(rightone, leftone) + 1;
    }
}
/*Input: root = [1,null,2]
Output: 2*/

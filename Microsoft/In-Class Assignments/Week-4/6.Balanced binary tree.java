class Solution {
    public boolean isBalanced(TreeNode root) { 
        return isBalance(root) == -1 ? false : true;
    }
    
    public int isBalance(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = isBalance(root.left);
        if(leftHeight == -1) return leftHeight;
        int rightHeight = isBalance(root.right);
        if(rightHeight == -1) return rightHeight;
        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

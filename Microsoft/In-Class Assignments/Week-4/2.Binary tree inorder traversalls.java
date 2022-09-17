class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
	TreeNode current = root; 
    while (current != null || !stack.isEmpty()) {
        while (current != null) { 
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        resultList.add(current.val);
        current = current.right;
    }
    return resultList;
    }
}

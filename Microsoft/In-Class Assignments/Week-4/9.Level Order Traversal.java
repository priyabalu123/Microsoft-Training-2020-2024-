class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> cur = new ArrayList<Integer>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                cur.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            res.add(cur);
        }
        return res;
    }
}

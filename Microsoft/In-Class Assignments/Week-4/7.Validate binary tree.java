class Solution {
    List<Integer> list = new ArrayList<Integer>();
    
    public boolean isValidBST(TreeNode root) {
        dfs(root,list);
        for (int i=0;i<list.size()-1;i++){
            if(list.get(i+1)<=list.get(i)){
                return false;
            }
        }
        return true;
    }
    public void dfs(TreeNode root, List<Integer> list){
        if(root!=null){
            dfs(root.left,list);
            list.add(root.val);
            dfs(root.right,list);
        }
      return;
    }
}

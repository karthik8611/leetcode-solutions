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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        level(root,list,0);
        return list;
        
        // level order traversal
        
    }
    
    private void level(TreeNode curr,List<List<Integer>> list,int level){
        if(curr==null){
            return;
        }
        
        if(list.size()==level)
            list.add(new ArrayList<>());
        list.get(level).add(curr.val);
        
        level(curr.left,list,level+1);
        level(curr.right,list,level+1);
        
        
        
        
        
    }
}
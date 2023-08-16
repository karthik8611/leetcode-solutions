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
        levelWise(root,0,list);
        return list;
        
        
    }
    
    public void levelWise(TreeNode root, int level,  List<List<Integer>> list){
        if(root==null) return;
        
        if(list.size()==level){
            list.add(new ArrayList<>());
          }
        list.get(level).add(root.val);
         levelWise(root.left,level+1,list);
        levelWise(root.right,level+1,list);
    
    }
}
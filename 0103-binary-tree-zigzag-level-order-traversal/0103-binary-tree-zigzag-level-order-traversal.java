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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        travel(list,0,root);
        return list;
       
        
        
        
    }
    
    public void travel(List<List<Integer>> list, int level,TreeNode root){
        if(root==null)return;
        
        if(list.size()<=level){
            list.add(new ArrayList<>());
        }
        
        if(level%2 ==0){
            list.get(level).add(root.val);
        }else{
           list.get(level).add(0,root.val); 
        }
        
        travel(list,level+1,root.left);
        travel(list,level+1,root.right);
        
        
        
        
    }
}
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
        if(root==null){
            return list;
        }
        levelOrderTraversal(root, list, 0);
        return list;
        
    }
    
    public  void levelOrderTraversal(TreeNode root,List<List<Integer>> list,int level){
         if(root==null){
             return ;
         }
        if(level==list.size()){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        levelOrderTraversal(root.left, list,level+1);
        levelOrderTraversal(root.right,list, level+1);
    }
}
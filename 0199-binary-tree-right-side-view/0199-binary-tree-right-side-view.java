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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list= new ArrayList<>();
        
        rightSide(root,list,0);
        return list;
      
       
    }
    
    public  void rightSide(TreeNode root, List<Integer> list,int depth){
        if(root==null){
            return;
        }
        
        // pre order traversal, time complexity:o(n), space complexity : o(h), height of the tree
         
    if(depth==list.size()){
       list.add(root.val);   
    }
        
        rightSide(root.right,list,depth+1);
        
        rightSide(root.left,list,depth+1);
       
      
      }
    
}
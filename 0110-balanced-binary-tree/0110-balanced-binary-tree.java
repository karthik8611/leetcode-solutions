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
     class Pair{
        boolean Balanced;
        int height;
        
        public Pair(boolean Balanced, int height){
            this.Balanced=Balanced;
            this.height=height;
        }
        
    }
    public Pair helperFun(TreeNode root){
        
        if(root==null){
            return new Pair(true,0);
        }
        
        Pair lst=helperFun(root.left);
        Pair rst=helperFun(root.right);
        
        int height=Math.max(lst.height,rst.height)+1;
        
        boolean isRootBalanced=Math.abs(lst.height-rst.height)<=1;
        
        if(lst.Balanced==true && rst.Balanced==true && isRootBalanced==true){
            return new Pair(true,height);
        }
            
        return new Pair(false,0);
    }
    public boolean isBalanced(TreeNode root) {
        Pair p = helperFun(root);
        
        return p.Balanced;
    }
}
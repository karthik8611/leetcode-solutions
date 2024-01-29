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
    public boolean isBalanced(TreeNode root) {
    if(root==null)return true;
    return height(root)!=-1;
    }
    
    // bottom up approach--> o(n) solution
    
    public int height(TreeNode node){
        if(node==null)return 0;
        int l=height(node.left);
        int r=height(node.right);
        int bl=Math.abs(l-r);
        
        
        
        if(bl>1 || r== -1 || l==-1) return -1;
        return 1+Math.max(l,r);
    }
    
    
}
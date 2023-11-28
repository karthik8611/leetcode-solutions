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
    
    private int max=1;
    public int widthOfBinaryTree(TreeNode root) {
        
    List<Integer> list = new ArrayList<>();
        
        width(root,1,0,list);
        return max;
        
    }
    
    public void  width(TreeNode root,int index, int level, List<Integer> list){
        if(root==null){
            return;
        }
        
        if(level==list.size()){
            list.add(index);
          
        }
          max=Math.max(max,index+1-list.get(level));
        width(root.left,index*2,level+1,list);
        width(root.right,index*2+1,level+1,list);
    }
}
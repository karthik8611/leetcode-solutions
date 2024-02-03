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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer, Integer> inOrderMap=new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
            inOrderMap.put(inorder[i],i);
        }
        
        return buildTree(preorder,inOrderMap,0,0,inorder.length-1);
        
    }
    
    public TreeNode buildTree(int[] preorder,Map<Integer,Integer> inOrderMap,int index,int left, int right)      {
        
        TreeNode root = new TreeNode(preorder[index]);
        
        int mid=inOrderMap.get(preorder[index]);
        
        if(left<mid){
            root.left=buildTree(preorder, inOrderMap,index+1,left, mid-1);
        }
        
        if(right>mid){
            root.right=buildTree(preorder,inOrderMap,index+mid-left+1,mid+1, right);
        
        }
        return root;
     }
}
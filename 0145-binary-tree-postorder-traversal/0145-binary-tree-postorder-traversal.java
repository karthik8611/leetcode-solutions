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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        Stack<TreeNode> stack= new Stack<>();
        
        if(root==null){
            return list;
            
        }
        
        stack.push(root);
        while(!stack.isEmpty()){
            root=stack.pop();
            list.add(0,root.val);
            
            if(root.left!=null)stack.push(root.left);
            if(root.right!=null)stack.push(root.right);
            
        }
        
        return list;
        
            
        
    
        
        
    }
}